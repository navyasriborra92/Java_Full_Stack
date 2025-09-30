package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Customer;
import com.model.TransactionHistory;
import com.repo.CustomerRepo;
import com.service.TransactionHistoryService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/transactions")
public class CustomerTransactionHistoryController {


	@Autowired
	CustomerRepo customerRepo;

	private final TransactionHistoryService transactionHistoryService;

	public CustomerTransactionHistoryController(TransactionHistoryService transactionHistoryService) {
		this.transactionHistoryService = transactionHistoryService;
	}

	@GetMapping("/transactionsall")
	public String listTransactions(
			HttpSession session,
			@RequestParam(name = "page",defaultValue = "0") int page,
			@RequestParam(name = "size",defaultValue = "10") int size,
			@RequestParam(name = "sortField",defaultValue = "localDateTime") String sortField,
			@RequestParam(name = "sortDir",defaultValue = "desc") String sortDir,
			Model model) {

		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null) {
			session.invalidate();
			return "redirect:/flm/user/login";
		}

		else {
			Page<TransactionHistory> transactionPage = transactionHistoryService.getTransactions(customer, page, size, sortField, sortDir);

			model.addAttribute("transactionPage", transactionPage);
			model.addAttribute("currentPage", page);
			model.addAttribute("totalPages", transactionPage.getTotalPages());
			model.addAttribute("totalItems", transactionPage.getTotalElements());
			model.addAttribute("sortField", sortField);
			model.addAttribute("sortDir", sortDir);
			model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
			model.addAttribute("accountNumber", customer.getAccountNumber());
			model.addAttribute("name", customer.getCustomerAccountDetails().getFirstname());
			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
			model.addAttribute("availablebalance",accountBalance);
			return "customertransactions";
		}
	}

//	@GetMapping("/transactionhistory")
//	public String getTransactionHistory(HttpSession session,Model model) {
//		Customer customer = (Customer) session.getAttribute("customer");
//		if(customer == null) {
//			session.invalidate();
//			return "redirect:/flm/user/login";
//		}
//		else {
//			List<TransactionHistory> alltransactions = transactionHistoryService.getAlltransactions(customer.getAccountNumber());
//			model.addAttribute("accountNumber", customer.getAccountNumber());
//			model.addAttribute("name", customer.getCustomerAccountDetails().getFirstname());
//			model.addAttribute("transactions",alltransactions);
//			double accountBalance = transactionHistoryService.accountBalance(customer.getAccountNumber());
//			model.addAttribute("availablebalance",accountBalance);
//			return "customertransactionhistory";
//		}
//	}
}
