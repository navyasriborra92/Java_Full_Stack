package com.flm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flm.model.User;

@Controller
public class UserController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Navya");
		model.addAttribute("user", new User());
		return "home";
	}
	
	@PostMapping("/submit")
	public String submit(@RequestParam String name, 
			@RequestParam String password,
			Model model) {
		model.addAttribute("name",name);
		model.addAttribute("password", password);
		return "success";
	}
	
	@PostMapping("/submitObject")
	public String submitObject(@ModelAttribute User user,
			Model model) {
		model.addAttribute("name",user.getName());
		model.addAttribute("password", user.getPassword());
		return "success";
	}
	
	@GetMapping("/users")
	public String users(Model model) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Sri", "12"));
		users.add(new User("nav", "1234"));
		model.addAttribute("userList",users);
		return "users";
	}
}
