package com.model;

import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Funds_Transfer")
public class FundsTransfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long TransactionId;
	
	private double amount;
	
	private String name;
	
	private String upiId;
	
	@CreationTimestamp
	private LocalDateTime transactionTime;
	
	@ManyToOne
	@JoinColumn(name = "accountNumber")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(long transactionId) {
		TransactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}


	public FundsTransfer(double amount, String name, String upiId, LocalDateTime transactionTime,
			 Customer customer) {
		super();
		this.amount = amount;
		this.name = name;
		this.upiId = upiId;
		this.transactionTime = transactionTime;
		this.customer = customer;
	}

	public FundsTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FundsTransfer(double amount2, String name2, String upiId2) {
		// TODO Auto-generated constructor stub
		super();
		this.amount = amount;
		this.name = name;
		this.upiId = upiId;
	}
	
	
}
