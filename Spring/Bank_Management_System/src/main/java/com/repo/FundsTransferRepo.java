package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.FundsTransfer;

@Repository
public interface FundsTransferRepo extends JpaRepository<FundsTransfer, Long>{

}
