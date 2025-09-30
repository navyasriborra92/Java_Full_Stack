package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Loans;

import jakarta.transaction.Transactional;

@Repository
public interface LoanRepo extends JpaRepository<Loans, Long> {
	
	@Modifying
	@Transactional
	@Query("Update Loans l set l.status = :status where l.loanId = :loanId")
	void updateLoanRequest(@Param("loanId") long loanId, @Param("status") String status);
	
	List<Loans> findAllByCustomer_AccountNumber(long accountNumber);

}
