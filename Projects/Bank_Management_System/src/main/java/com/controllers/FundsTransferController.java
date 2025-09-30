package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exceptions.FilltheDetailsException;
import com.exceptions.InsufficientBalanceException;
import com.exceptions.InvalidAmountException;
import com.exceptions.InvalidUpiIdException;
import com.model.Customer;
import com.model.FundsTransfer;
import com.service.FundsTransferService;
import com.service.TransactionHistoryService;
import com.service.TransactionHistoryServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/transfer")
public class FundsTransferController {

	@Autowired
	FundsTransferService fundsTransferService;
	
	@Autowired
	TransactionHistoryService transactionHistoryService;

	@GetMapping("/fundstransfer")
	public String showFundsTransferForm(HttpSession session, Model model) {
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
		else {
			model.addAttribute("name",customer.getCustomerAccountDetails().getFirstname());
			model.addAttribute("accountNumber",customer.getAccountNumber());
			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
			model.addAttribute("availablebalance",accountBalance);
			return "customerfundstransfer";
		}
	}

	@PostMapping("/transferfunds")
	public String fundsTransfer(
			@RequestParam(name = "amount") double amount,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "upiId") String upiId,
			FundsTransfer fundsTransfer, Model model,
			HttpSession session) 
	{
		Customer customer = (Customer) session.getAttribute("customer");
		if(customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}
		try {
			boolean saveTransaction = fundsTransferService.saveTransaction(amount, name, upiId, customer);
			if(saveTransaction) {
				double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
				model.addAttribute("availablebalance",accountBalance);
				model.addAttribute("transfermessage","Transaction successfully completed");
				}	
			else {
				model.addAttribute("error","Transaction declined");
			}
		}
		catch(FilltheDetailsException ex) {
			model.addAttribute("error", ex.getMessage());
		}
		catch(InsufficientBalanceException ex) {
			model.addAttribute("error", ex.getMessage());
		}
		catch(InvalidUpiIdException ex) {
			model.addAttribute("error", ex.getMessage());
		}
		catch(InvalidAmountException ex) {
			model.addAttribute("error", ex.getMessage());
		}
		catch(Exception ex) {
			model.addAttribute("error", "Something went wrong while transferring the funds, if any amount deducted will be refunded within 24 hrs");
		}
			return "customerfundstransactionstatus";
	}


}
