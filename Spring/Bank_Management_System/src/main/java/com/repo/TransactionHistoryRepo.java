package com.repo;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.TransactionHistory;

@Repository
public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory, Long>{

	Page<TransactionHistory> findByCustomer_AccountNumber(Long accountNumber, Pageable pageable);
	
	List<TransactionHistory> findByCustomer_AccountNumber(Long accountNumber);	
	
	Page<TransactionHistory> findByCustomer(Customer customer, Pageable pageable);

}
