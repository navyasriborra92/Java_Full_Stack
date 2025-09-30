package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FundsTransferDao;
import com.exceptions.FilltheDetailsException;
import com.exceptions.InsufficientBalanceException;
import com.exceptions.InvalidAmountException;
import com.exceptions.InvalidUpiIdException;
import com.model.Customer;
import com.model.FundsTransfer;
import com.model.Otp;
import com.model.TransactionHistory;
import com.repo.CustomerRepo;
import com.repo.FundsTransferRepo;
import com.repo.TransactionHistoryRepo;

@Service
public class FundsTransferServiceImpl implements FundsTransferService{

	@Autowired
	FundsTransferRepo fundsTransferRepo;

	@Autowired
	TransactionHistoryRepo transactionHistoryRepo;

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	TransactionHistoryService TransactionHistoryService;

	public Customer getCustomerById(Customer customer) {
		Customer customer2 = customerRepo.findById(customer.getAccountNumber()).get();
		if(customer2 == null) {
			return null;
		}
		else {
			return customer2;
		}
	}

	public boolean saveTransaction(double amount, String name ,String  upiId, Customer customer) {
		Customer customer2 = customerRepo.findById(customer.getAccountNumber()).get();
		if(customer2 ==  null || name== null || upiId == null || String.valueOf(amount) == null) {
			throw new FilltheDetailsException("All Fileds are required");
		}
		double accountBalance = TransactionHistoryService.accountBalance(customer.getAccountNumber());
		if(accountBalance < amount) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		if(upiId == null || upiId.isEmpty()) {
			throw new InvalidUpiIdException("UpiId cannot be empty");
		}
		if(amount <=0) {
			throw new InvalidAmountException("Invalid amount given please enter amount greater than zero");
		}
		else {
			System.out.println("in else");
			FundsTransfer fundsTransfer = new FundsTransfer();
			fundsTransfer.setAmount(amount);
			fundsTransfer.setName(name);
			fundsTransfer.setUpiId(upiId);
			fundsTransfer.setCustomer(customer2);
			fundsTransferRepo.save(fundsTransfer);
			TransactionHistory copyFundsTransferToTransactionHistory = copyFundsTransferToTransactionHistory(fundsTransfer);
			copyFundsTransferToTransactionHistory.setCustomer(customer2);
			transactionHistoryRepo.save(copyFundsTransferToTransactionHistory);
			return true;
		}
	}

	@Override
	public boolean verifyOtp(long accountNumber, int otp) {
		//		// TODO Auto-generated method stub
		//		boolean verifyOtp = fundsTransferRep
		//		if(verifyOtp) {
		//			return true;
		//		}
		return false;
	}

	public void genOtp(long accountNumber) {
		//		fundsTransferRepo.generateOtp(accountNumber);
	}

	public TransactionHistory copyFundsTransferToTransactionHistory(FundsTransfer fundsTransfer) {
		System.out.println("inside cpoy");
		TransactionHistory transactionHistory = new TransactionHistory();
		transactionHistory.setAmount(fundsTransfer.getAmount());
		transactionHistory.setName(fundsTransfer.getName());
		transactionHistory.setTransactionId(fundsTransfer.getTransactionId());
		transactionHistory.setUpiId(fundsTransfer.getUpiId());
		transactionHistory.setDescription("UPI Transaction");
		transactionHistory.setType("debit");
		transactionHistory.setTransaction_type("upi");
		transactionHistory.setLocalDateTime(fundsTransfer.getTransactionTime());
		double accountBalance = TransactionHistoryService.accountBalance(fundsTransfer.getCustomer().getAccountNumber());
		transactionHistory.setAvailableBalance(accountBalance);
		return transactionHistory;
	}

}
