package com.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Admin;
import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.model.Loans;

@Service
public interface AdminService {

	public Admin getAdminLoginDetails(String email, String password);

	public void addCustomerInfo(Long accountNumber, String password, String status);

	public void addCustomerPersonalDetails(Long accountNumber, String firstname, String lastname, String address, Long contactNo,
			Date dateOfBirth, String email);

	public List<Customer> getallCustomers();

	public List<CustomerAccountDetails> getAllCustomersPersonalDetails();

	public List<Loans> getLoanRequests();

	public void approveLoanRequests(String action, long LoanId);

	public void declineLoanRequests(String action, long loanId);
	
	public void deleteCustomer(String action, long accountNo, String password);

	public void resetPassword(String email, String password, String confirmpassword);


}
