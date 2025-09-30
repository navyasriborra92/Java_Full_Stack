package com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	private long accountNumber;
	
	private String password;
	
	private String status;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private Otp otp;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private CustomerAccountDetails customerAccountDetails;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FundsTransfer> fundsTransfer = new ArrayList<FundsTransfer>();
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransactionHistory> transactions;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Loans> loans;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Otp getOtp() {
		return otp;
	}

	public void setOtp(Otp otp) {
		this.otp = otp;
	}

	public CustomerAccountDetails getCustomerAccountDetails() {
		return customerAccountDetails;
	}

	public void setCustomerAccountDetails(CustomerAccountDetails customerAccountDetails) {
		this.customerAccountDetails = customerAccountDetails;
	}

	public List<FundsTransfer> getFundsTransfer() {
		return fundsTransfer;
	}

	public void setFundsTransfer(List<FundsTransfer> fundsTransfer) {
		this.fundsTransfer = fundsTransfer;
	}

	public List<TransactionHistory> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionHistory> transactions) {
		this.transactions = transactions;
	}

	public List<Loans> getLoans() {
		return loans;
	}

	public void setLoans(List<Loans> loans) {
		this.loans = loans;
	}

	public Customer(long accountNumber, String password, String status, Otp otp,
			CustomerAccountDetails customerAccountDetails, List<FundsTransfer> fundsTransfer,
			List<TransactionHistory> transactions, List<Loans> loans) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.status = status;
		this.otp = otp;
		this.customerAccountDetails = customerAccountDetails;
		this.fundsTransfer = fundsTransfer;
		this.transactions = transactions;
		this.loans = loans;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


}
