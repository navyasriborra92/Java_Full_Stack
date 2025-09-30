package com.flm.service;

import org.springframework.stereotype.Service;

import com.flm.model.UserAop;

@Service
public interface UserService {
	public UserAop saveUser(UserAop userAop);
}
