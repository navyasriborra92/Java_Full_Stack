package com.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.model.Customer;
import com.model.TransactionHistory;

public interface AdminReportsService {
	
	public ByteArrayInputStream generateTransactionReport();
	
	public ByteArrayInputStream generateCustomerReport();

}
