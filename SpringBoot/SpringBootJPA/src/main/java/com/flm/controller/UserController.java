package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.User;
import com.flm.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/save")
	public int saveUser() {
		int save = userService.save();
		return save;
	}
	
//	@GetMapping("/user")
//	public void findUser() {
//		userService.getUser();
//	}
	
	@GetMapping("/allusers")
	public void findUsers() {
		userService.getAllUsers();
	}
	
	@GetMapping("/byidandpassword")
	public User findUserAndPassword(@RequestParam(name = "id")int id, @RequestParam(name = "password") String password) {
		User userIdAndPassword = userService.findUserIdAndPassword(id, password);
		return userIdAndPassword;		
	}
	@GetMapping("/byidorpassword")
	public User findUserOrPassword(@RequestParam(name = "id")int id, @RequestParam(name = "password") String password) {
		User userIdAndPassword = userService.findUserIdOrPassword(id, password);
		return userIdAndPassword;		
	}
	
}
