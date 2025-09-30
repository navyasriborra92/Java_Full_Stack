package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.CustomerAccountDetailsDao;
import com.exceptions.AccountNotFoundException;
import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.repo.CustomerAccountDetailsRepo;
import com.repo.CustomerRepo;

@Service
public class CustomerAccountDetailsServiceImpl implements CustomerAccountDetailsService{

	@Autowired
	CustomerAccountDetailsRepo customerAccountDetailsRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	public CustomerAccountDetails getAccountDetails(Customer customer) {
		CustomerAccountDetails accountDetails = customerAccountDetailsRepo.findByCustomer_AccountNumber(customer.getAccountNumber())
				.orElseThrow(()-> new AccountNotFoundException("Account Details not Found"));
		accountDetails.setCustomer(customer);
		return accountDetails;
	}
}
