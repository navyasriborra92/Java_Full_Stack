package com.flm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.model.UserAop;

@Repository
public interface UserRepository extends JpaRepository<UserAop, Long>{

}
