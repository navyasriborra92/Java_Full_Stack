package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.CustomerAccountDetails;

@Repository
public interface CustomerAccountDetailsRepo extends JpaRepository<CustomerAccountDetails, Long>{

	Optional<CustomerAccountDetails> findByCustomer_AccountNumber(Long accountNumber);
	void deleteByCustomer_AccountNumber(long accountNumber);
}
