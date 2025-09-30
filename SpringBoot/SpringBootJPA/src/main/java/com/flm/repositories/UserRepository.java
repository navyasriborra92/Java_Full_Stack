package com.flm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flm.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where id =:id")
	User findByUserId(@Param("id") int id);
	
	@Query(value = "select * from usersinfo where id = 1", nativeQuery = true)
	User findByNativeQueryUserId(int id);
	
	User findById(int id);
	
	User findByIdAndPassword(int id, String password);

	User findByIdOrPassword(int id, String password);
	
}
