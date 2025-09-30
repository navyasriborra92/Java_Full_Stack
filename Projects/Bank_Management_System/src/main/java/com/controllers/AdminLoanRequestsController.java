package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Admin;
import com.model.Loans;
import com.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/loans")
public class AdminLoanRequestsController {

	@Autowired
	AdminService adminService;

	@GetMapping("/loanrequests")
	public String getLoanRequests(HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		else {
			List<Loans> loanRequests = adminService.getLoanRequests();
			model.addAttribute("loanRequests",loanRequests);
			return "adminloanrequests";
		}
	}

	@PostMapping("/updaterequests")
	public String getLoanRequests(
			@RequestParam(name = "loanId") long loanId,
			@RequestParam("action") String action,
			HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		Admin adminDetails = adminService.getAdminLoginDetails(admin.getEmail(), admin.getPassword());
		if(adminDetails == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		else {
			if("Approve".equalsIgnoreCase(action)) {
				adminService.approveLoanRequests(action, loanId);
				model.addAttribute("message", "Loan Request approved Successfully");
			}
			else if("Decline".equalsIgnoreCase(action)) {
				adminService.declineLoanRequests(action, loanId);
				model.addAttribute("message", "Loan Request declined Successfully");
			}
			return "redirect:/flm/admin/loans/loanrequests";
		}
	}
}
