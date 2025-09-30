package com.service;

import org.springframework.stereotype.Service;

import com.model.Customer;

public interface UserRegistrationService {

	public Customer authenticateUser(long accountNumber, String password);
	public void saveUserNewPassword(long accountNumber, String oldpassword, String newpassword);
	public Customer findCustomer(long accountNumber);
}
