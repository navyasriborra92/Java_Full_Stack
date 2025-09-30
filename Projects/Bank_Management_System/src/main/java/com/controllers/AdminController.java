package com.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Admin;
import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.model.Loans;
import com.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/adminlogin")
	public String showLoginForm() {
		return "adminlogin";
	}
	@GetMapping("/adminhome")
	public String getAdminHomePage(
			@RequestParam(name = "email")String email,
			@RequestParam(name = "password")String password,
			HttpSession session,
			Model model) {
		Admin admin = adminService.getAdminLoginDetails(email, password);
		if(admin != null) {
			model.addAttribute("admin",admin);
			session.setAttribute("admin", admin);
			return "adminhome";
		}
		else {
			session.invalidate();
			model.addAttribute("error", "invalid username or password");
			return "redirect:/adminlogin";
		}
	}

	@GetMapping("/admindetails")
	public String getAdminDetails(HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin !=null)
		{
			model.addAttribute("adminDetails",admin);
			session.setAttribute("admin", admin);
			return "admindetails";
		}
		else {
			session.invalidate();
			return "redirect:/adminlogin";
		}
	}

	@GetMapping("/adminresetpassword")
	public String ahowresetPasswordForm(HttpSession session) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null) {
			return "redirect:/adminlogin";
		}
		return "adminresetpassword";
	}

	@PostMapping("/resetPassword")
	public String resetPassword(
			@RequestParam(name = "email")String email,
			@RequestParam(name = "password")String password,
			@RequestParam(name = "confirmpassword") String confirmpassword,
			HttpSession session,
			Model model) {
		Admin admin = adminService.getAdminLoginDetails(email, password);
		if(admin != null) {
			adminService.resetPassword(email, password, confirmpassword);
			session.invalidate();
			return "redirect:/adminlogin";
		}
		else {
			model.addAttribute("error", "invalid username or password");
			return "adminresetpassword";
		}
	}

	@GetMapping("/adminlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "adminlogout";
	}

}
