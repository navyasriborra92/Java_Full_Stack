package com.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.FundsTransfer;
import com.model.Otp;

public interface FundsTransferService {
	
	public boolean saveTransaction(double amount, String name, String upiId,Customer customer);

	public boolean verifyOtp(long accountNumber, int otp);
	
	public void genOtp(long accountNumber);
	
	public Customer getCustomerById(Customer customer); 

}
