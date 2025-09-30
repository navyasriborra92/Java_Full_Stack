package com.model;

import java.util.List;

import com.constants.LoanType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Loans")
public class Loans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanId;
	
	@Enumerated(EnumType.STRING)
	private LoanType loantype;
	
	private double amount;
	
	public int emiduration;
	
	public double emi;
	
	private String status;

	@ManyToOne
	@JoinColumn(name = "accoutnNumber")
	private Customer customer;
	
	public int getEmiduration() {
		return emiduration;
	}

	public void setEmiduration(int emiduration) {
		this.emiduration = emiduration;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}


	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public Loans(LoanType loantype, double amount, int emiduration, double emi, String status, Customer customer) {
		super();
		this.loantype = loantype;
		this.amount = amount;
		this.emiduration = emiduration;
		this.emi = emi;
		this.status = status;
		this.customer = customer;
	}

	public LoanType getLoantype() {
		return loantype;
	}

	public void setLoantype(LoanType loantype) {
		this.loantype = loantype;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Loans() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
