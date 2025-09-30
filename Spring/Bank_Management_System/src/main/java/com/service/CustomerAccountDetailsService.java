package com.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.CustomerAccountDetails;

@Service
public interface CustomerAccountDetailsService {

	public CustomerAccountDetails getAccountDetails(Customer customer);
}
