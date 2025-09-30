package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptions.AccountNotFoundException;
import com.model.Customer;
import com.repo.CustomerRepo;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{
	
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer authenticateUser(long accountNumber, String password) {		
		Customer cust = customerRepo.findByAccountNumberAndPassword(accountNumber,password)
				.orElseThrow(() -> new AccountNotFoundException("Invalid AccountNumber or Password"));
		return cust;
	}
	
	public void saveUserNewPassword(long accountNumber, String oldpassword, String newpassword) {
		
		Customer cust = customerRepo.findByAccountNumberAndPassword(accountNumber, oldpassword)
				.orElse(null);
		if(cust!= null) {
			cust.setPassword(newpassword);
			cust.setStatus("registered");
			customerRepo.save(cust);
		}		
		
	}
	
	public Customer findCustomer(long accountNumber) {
		Customer customer = customerRepo.findById(accountNumber).get();
		return customer;
		
	}

}
