package com.controllers;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Admin;
import com.model.Customer;
import com.model.TransactionHistory;
import com.service.AdminReportsService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/reports")
public class AdminReportsController {
	
	@Autowired
	AdminReportsService adminReportsService;
	
	@GetMapping("/show")
	public String showReports(HttpSession session, Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null) {
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		else {
			return "adminreports";
		}
	}

	@GetMapping("/pdf")
	public String downloadReports(HttpSession session, Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null) {
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		else {
		ByteArrayInputStream customerReport = adminReportsService.generateCustomerReport();
		ByteArrayInputStream transactionReport = adminReportsService.generateTransactionReport();
		model.addAttribute("customerReport", customerReport);
		model.addAttribute("transactionReport", transactionReport);
		return "adminreports";
		}
	}
	
	@GetMapping("transactions/pdf")
	public void exportTransactionsPdf(HttpServletResponse response) throws Exception {
	    response.setContentType("application/pdf");
	    response.setHeader("Content-Disposition", "attachment; filename=transactions_report.pdf");

	    ByteArrayInputStream pdfStream = adminReportsService.generateTransactionReport();

	    response.getOutputStream().write(pdfStream.readAllBytes());
        response.getOutputStream().flush();
	}
	
	@GetMapping("customers/pdf")
	public void exportCustomersPdf(HttpServletResponse response) throws Exception {
	    response.setContentType("application/pdf");
	    response.setHeader("Content-Disposition", "attachment; filename=customers_report.pdf");

	    ByteArrayInputStream pdfStream = adminReportsService.generateCustomerReport();

	    response.getOutputStream().write(pdfStream.readAllBytes());
        response.getOutputStream().flush();
	}
	
}
