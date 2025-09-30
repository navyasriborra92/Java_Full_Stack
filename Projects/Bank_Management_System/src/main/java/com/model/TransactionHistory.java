package com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction_history")
public class TransactionHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long TransactionHistoryId;
	
	private long TransactionId;
	
	private double amount;
	
	private String name;
	
	private String upiId;
	
	private String debitedTo;
	
	private String creditedFrom;
	
	private String transaction_type;
	
	private String description;
	
	private LocalDateTime localDateTime;
	
	private String type;
	
	private double availableBalance;
	
	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	@ManyToOne
    @JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber")
    private Customer customer;
	

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

	public String getDebitedTo() {
		return debitedTo;
	}

	public void setDebitedTo(String debitedTo) {
		this.debitedTo = debitedTo;
	}

	public String getCreditedFrom() {
		return creditedFrom;
	}

	public void setCreditedFrom(String creditedFrom) {
		this.creditedFrom = creditedFrom;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTransactionHistoryId() {
		return TransactionHistoryId;
	}

	public void setTransactionHistoryId(long transactionHistoryId) {
		TransactionHistoryId = transactionHistoryId;
	}

	public TransactionHistory(long transactionId, double amount, String name, String upiId, String debitedTo,
			String creditedFrom, String transaction_type, String description, LocalDateTime localDateTime, String type,
			double availableBalance, Customer customer) {
		super();
		TransactionId = transactionId;
		this.amount = amount;
		this.name = name;
		this.upiId = upiId;
		this.debitedTo = debitedTo;
		this.creditedFrom = creditedFrom;
		this.transaction_type = transaction_type;
		this.description = description;
		this.localDateTime = localDateTime;
		this.type = type;
		this.availableBalance = availableBalance;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public TransactionHistory() {
		super();
		// TODO Auto-generated constructor stub
	}





	
}
