package com.flm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flm.model.User;
import com.flm.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	
	public int save() {
		User user = new User("123450987");
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
	
//	public void getUser() {
//		Optional<User> byId = Optional.of(userRepository.findByUserId(1));
//		System.out.println(byId);
//	}
	
	public void getAllUsers() {
		List<User> all = userRepository.findAll();
		System.out.println(all);
	}
	
	public User getUserInfo() {
		List<User> all = userRepository.findAll();
		System.out.println(all);
		return null;
	}
	
	public User findUserId() {
		User byId2 = userRepository.findById(1);
		System.out.println(byId2);
		return byId2;
	}
	
	public User findUserIdAndPassword(int id, String password) {
		User byIdAndPassword = userRepository.findByIdAndPassword(id, password);
		System.out.println(byIdAndPassword);
		return byIdAndPassword;
	}
	
	public User findUserIdOrPassword(int id, String password) {
		User byIdOrPassword = userRepository.findByIdOrPassword(id, password);
		System.out.println(byIdOrPassword);
		return byIdOrPassword;
	}
	

}
