package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constants.LoanType;
import com.model.Customer;
import com.model.Loans;
import com.repo.CustomerRepo;
import com.repo.LoanRepo;

@Service
public class LoanServiceImpl implements LoanService{

	@Autowired
	LoanRepo loanRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	@Override
	public void applyLoan(Customer customer,String loantype, double emi, int emiduration, double loanamount) {
		// TODO Auto-generated method stub
		Customer customer2 = customerRepo.findByAccountNumberAndPassword(customer.getAccountNumber(),customer.getPassword())
				.orElse(null);
		Loans loans = new Loans();
		loans.setAmount(loanamount);
		loans.setEmiduration(emiduration);
		loans.setEmi(emi);	
		LoanType valueOf = LoanType.valueOf(loantype);
		loans.setLoantype(valueOf);
		loans.setStatus("Applied");
		loans.setCustomer(customer2);
		if(customer2!= null) {
			loanRepo.save(loans);
		}
	}
	@Override
	public List<Loans> getLoans(long accountNumber) {
		// TODO Auto-generated method stub
		List<Loans> all = loanRepo.findAllByCustomer_AccountNumber(accountNumber);
		return all;
	}

}
