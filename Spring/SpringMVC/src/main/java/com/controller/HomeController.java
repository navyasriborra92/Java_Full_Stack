package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/hi")
//	@ResponseBody
	public String hi() {
		return "home";
	}
	
	@RequestMapping("/home")
	@ResponseBody
	public String hi2() {
		return "home";
	}
	
	@RequestMapping("/data")
	public String hi3(Model model) {
		model.addAttribute("name", "Navya");
		return "home";
	}
	
	@PostMapping("/signup")
	public String hi4(Model model, HttpServletRequest http) {
		String email = http.getParameter("email");
		String password = http.getParameter("password");
		model.addAttribute("name", "Navya");
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "signup";
	}
}
