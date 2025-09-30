package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.constants.LoanType;
import com.model.Customer;
import com.model.Loans;

@Service
public interface LoanService {

	void applyLoan(Customer customer,String loantype, double emi, int emiduration, double loanamount);
	
	List<Loans> getLoans(long accountNumber);

}
