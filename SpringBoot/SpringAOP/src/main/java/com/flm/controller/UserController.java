package com.flm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.UserAop;
import com.flm.service.UserService;

@RestController
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/save")
	public void saveUser(UserAop userAop) {
		userService.saveUser(userAop);
	}
	


}
