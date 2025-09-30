package com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.TransactionHistory;

@Service
public interface TransactionHistoryService {

    public Page<TransactionHistory> getTransactions(Customer customer, int page, int size, String sortField, String sortDir);
	
	public List<TransactionHistory> getAlltransactions(long accountNumber);
	
	public double accountBalance(long accountNumber); 
}
