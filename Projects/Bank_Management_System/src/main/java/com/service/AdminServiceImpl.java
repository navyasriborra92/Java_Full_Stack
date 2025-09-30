package com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.model.Loans;
import com.repo.AdminRepo;
import com.repo.CustomerAccountDetailsRepo;
import com.repo.CustomerRepo;
import com.repo.LoanRepo;

import jakarta.transaction.Transactional;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	CustomerAccountDetailsRepo customerAccountDetailsRepo;
	
	@Autowired
	LoanRepo loanRepo;
	
	@Override
	public Admin getAdminLoginDetails(String email, String password) {
		// TODO Auto-generated method stub
		Admin admin = adminRepo.findByEmailAndPassword(email,password)
				.orElse(null);
		return admin;
	}

	@Override
	public void addCustomerInfo(Long accountNumber, String password, String status) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setAccountNumber(accountNumber);
		customer.setPassword(password);
		customer.setStatus(status);
		Customer save = customerRepo.save(customer);

	}

	@Override
	public void addCustomerPersonalDetails(Long accountNumber, String firstname, String lastname, String address, Long contactNo,
			Date dateOfBirth, String email) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setAccountNumber(accountNumber);
		CustomerAccountDetails customerAccountDetails = new CustomerAccountDetails();
		customerAccountDetails.setAddress(address);
		customerAccountDetails.setContactNo(contactNo);
		customerAccountDetails.setDateofbirth(dateOfBirth);
		customerAccountDetails.setEmail(email);
		customerAccountDetails.setFirstname(firstname);
		customerAccountDetails.setLastname(lastname);
		customerAccountDetails.setCustomer(customer);

		customerAccountDetailsRepo.save(customerAccountDetails);
	}

	@Override
	public List<Customer> getallCustomers() {
		// TODO Auto-generated method stub
		List<Customer> all = customerRepo.findAll();
		return all;
		
	}

	@Override
	public List<CustomerAccountDetails> getAllCustomersPersonalDetails() {
		// TODO Auto-generated method stub
		List<CustomerAccountDetails> all = customerAccountDetailsRepo.findAll();
		return all;
	}

	@Override
	public List<Loans> getLoanRequests() {
		// TODO Auto-generated method stub
		List<Loans> all = loanRepo.findAll();
		return all;
	}

	@Override
	public void approveLoanRequests(String action, long loanId) {
		// TODO Auto-generated method stub
		Loans loans = loanRepo.findById(loanId)
				.orElse(null);
		if(loans != null) {
			loans.setStatus("Approved");
			loanRepo.save(loans);
		}		
	}

	@Override
	public void declineLoanRequests(String action, long loanId) {
		// TODO Auto-generated method stub
		Loans loans = loanRepo.findById(loanId)
				.orElse(null);
		if(loans != null) {
			loans.setStatus("Declined");
			loanRepo.save(loans);
		}	
	}

	@Override
	@Transactional
	public void deleteCustomer(String action, long accountNo, String password) {
		// TODO Auto-generated method stub
		Optional<Customer> byAccountNumberAndPassword = customerRepo.findByAccountNumberAndPassword(accountNo, password);
		if(byAccountNumberAndPassword.isPresent()) {
//			customerAccountDetailsRepo.deleteByCustomer_AccountNumber(accountNo);
			customerRepo.deleteById(accountNo);
			
		}
	}

	@Override
	public void resetPassword(String email, String password,String confirmpassword) {
		// TODO Auto-generated method stub
		Admin admin = adminRepo.findByEmailAndPassword(email, password).orElse(null);
		if(admin != null) {
			admin.setPassword(confirmpassword);
			adminRepo.save(admin);
		}
	}
	
	

}
