package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.service.CustomerAccountDetailsService;
import com.service.TransactionHistoryService;
import com.service.TransactionHistoryServiceImpl;
import com.service.UserRegistrationServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	CustomerAccountDetailsService customerAccountDetailsService;
	
	@Autowired
	TransactionHistoryService transactionHistoryService;

	
	@GetMapping("/accounthomepage")
	public String accounthomepage(HttpSession session, Model model) 
	{
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/loginpage";
		}
		else {		
			CustomerAccountDetails accountDetails = customerAccountDetailsService.getAccountDetails(customer);	
			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
			model.addAttribute("availablebalance",accountBalance);
			model.addAttribute("accountdetails",accountDetails);
			session.setAttribute("customer", customer);
			return "customerhome";
		}
		
	}
		
	@GetMapping("/accountdetails")
	public String accountDashboard(HttpSession session, Model model) 
	{
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/loginpage";
		}
		else {	
		double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
		model.addAttribute("availablebalance",accountBalance);
		CustomerAccountDetails accountDetails = customerAccountDetailsService.getAccountDetails(customer);
		model.addAttribute("accountdetails",accountDetails);
		return "customeraccountdetails";
		}
	}	

}
