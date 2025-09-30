package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.constants.LoanType;
import com.model.Customer;
import com.model.Loans;
import com.repo.CustomerRepo;
import com.service.LoanService;
import com.service.TransactionHistoryService;
import com.service.TransactionHistoryServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	TransactionHistoryService transactionHistoryService;

	@GetMapping("/loanapplication")
	public String showLoanform(Model model, HttpSession session) {
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
		else {
			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
			model.addAttribute("name",customer.getCustomerAccountDetails().getFirstname());
			model.addAttribute("accountNumber",customer.getAccountNumber());
			model.addAttribute("balance",accountBalance);
			model.addAttribute("loanTypes", LoanType.values());
		return "customerloanapplication";
		}
	}

	@PostMapping("/applyloan")
	public String applyLoan(
			@RequestParam(name = "loanType") String loantype,
			@RequestParam(name = "emi") double emi,
			@RequestParam(name = "emiduration") int emiduration,
			@RequestParam(name = "amount") double loanamount,
			HttpSession session, Model model) {
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
		else {
			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
			model.addAttribute("name",customer.getCustomerAccountDetails().getFirstname());
			model.addAttribute("balance",accountBalance);
			model.addAttribute("accountNumber",customer.getAccountNumber());
			model.addAttribute("name",customer.getCustomerAccountDetails().getFirstname());
			model.addAttribute("email",customer.getCustomerAccountDetails().getEmail());
			loanService.applyLoan(customer,loantype,emi,emiduration,loanamount);
			return "redirect:/flm/loan/loanstatus";
		}
	}
	
	@GetMapping("/loanstatus")
	public String getLoanStatus(Model model, HttpSession session) {
		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
		else {
		List<Loans> loans = loanService.getLoans(customer.getAccountNumber());
		model.addAttribute("loans",loans);
		return "customerloanstatus";
		}
	}
	

}
