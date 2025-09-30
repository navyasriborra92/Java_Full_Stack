package com.flm.service;

import org.springframework.stereotype.Service;

import com.flm.model.UserAop;
import com.flm.repo.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserAop saveUser(UserAop userAop) {
		UserAop userAop2 = userRepository.save(userAop);
		return userAop2;
	}

}
