package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.service.CustomerAccountDetailsService;
import com.service.UserRegistrationService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	
	@Autowired
	CustomerAccountDetailsService customerAccountDetailsService;
	
	@GetMapping("/login")
	public String showLoginform() 
	{
		return "customerloginpage";
	}
	
	@GetMapping("/loginpage")
	public String login(
			@RequestParam(name = "accountNumber") long accountNumber, 
			@RequestParam(name = "password") String password,
			Model model, HttpSession session) 
	{
		Customer authenticatedUser = userRegistrationService.authenticateUser(accountNumber, password);
		//Verifying if user is authenticated or not
		if(authenticatedUser!= null && authenticatedUser.getStatus().equalsIgnoreCase("registered")) {
			session.setAttribute("customer", authenticatedUser);
			return "redirect:/flm/home/accounthomepage";
		}
		//New customer redirecting to registration page
		else {
			model.addAttribute("error", "Please register yourself if logging in for the First time");
			return "customerresetPassword";
		}
	}
	
	@GetMapping("/resetPasswordForm")
	public String resetPassword() 
	{
		return "customerresetPassword";
	}
	
	@PostMapping("/resetPassword")
	public String newRegistration(
			@RequestParam(name = "accountNumber") long accountNumber, 
			@RequestParam(name = "oldpassword") String oldpassword,
			@RequestParam(name = "confirmpassword") String confirmpassword,
			HttpSession session,
			Model model, Customer cust)
	{
		Customer authenticatedUser = userRegistrationService.authenticateUser(accountNumber, oldpassword);
		if(authenticatedUser != null ) {
			userRegistrationService.saveUserNewPassword(accountNumber, oldpassword, confirmpassword);
			session.setAttribute("customer", authenticatedUser);
			model.addAttribute("resetmessage", "Password changed successfully");
			return "redirect:/flm/user/login";
		}
		else {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "customerlogout";
	}

}
