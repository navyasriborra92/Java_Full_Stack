package com.service;


import org.springframework.data.domain.PageRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.TransactionHistory;
import com.repo.CustomerRepo;
import com.repo.TransactionHistoryRepo;
@Service
public class TransactionHistoryServiceImpl implements TransactionHistoryService{

	private final TransactionHistoryRepo transactionHistoryRepo;
	
	public TransactionHistoryServiceImpl(TransactionHistoryRepo transactionHistoryRepo) {
		this.transactionHistoryRepo = transactionHistoryRepo;
	}
	
	@Autowired
	CustomerRepo customerRepo;
	
	
    public Page<TransactionHistory> getTransactions(Customer customer, int page, int size, String sortField, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortField).ascending()
                                                    : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return transactionHistoryRepo.findByCustomer(customer, pageable);
    }
    
    public List<TransactionHistory> getAlltransactions(long accountNumber){
    	System.out.println("inside service "+ accountNumber);
    	List<TransactionHistory> byCustomer_AccountNumber = transactionHistoryRepo.findByCustomer_AccountNumber(accountNumber);
    	return byCustomer_AccountNumber;
    }

	@Override
	public double accountBalance(long accountNumber) {
		// TODO Auto-generated method stub
		List<TransactionHistory> byCustomer_AccountNumber = transactionHistoryRepo.findByCustomer_AccountNumber(accountNumber);
		double debitbalance = 0;
		double creditbalance = 0;
		double availablebalance = 0;
		for(TransactionHistory t:byCustomer_AccountNumber) {
			if(t.getType().equalsIgnoreCase("debit")) {
				debitbalance += t.getAmount();
			}
			else if(t.getType().equalsIgnoreCase("credit")) {
				creditbalance += t.getAmount();
			}
			availablebalance = creditbalance-debitbalance;
		}
		System.out.println(availablebalance);
		return availablebalance;
	}


}
