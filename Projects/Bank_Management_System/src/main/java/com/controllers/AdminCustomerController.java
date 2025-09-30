package com.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Admin;
import com.model.Customer;
import com.model.CustomerAccountDetails;
import com.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/customers")
public class AdminCustomerController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/showcustomerform")
	public String showCustomerForm(HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		else {
			return "adminaddcustomer";
		}
	}
	
	@PostMapping("/add")
	public String addCustomer(
			@RequestParam(name = "accountNumber") Long accountNumber,
			@RequestParam(name = "password") String password,
			@RequestParam(name = "status") String status,
			@RequestParam(name = "firstname") String firstname,
			@RequestParam(name = "lastname") String lastname,
			@RequestParam(name = "address") String address,
			@RequestParam(name = "contactNo") Long contactNo,
			@RequestParam(name = "dateOfBirth") 
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth,
			@RequestParam(name = "email") String email,
			HttpSession session, Model model) {
		Admin admin = (Admin) session.getAttribute("admin");

		if(admin == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
	    try {
	        // Save basic info
	        adminService.addCustomerInfo(accountNumber, password, status);

	        // Save personal details
	        adminService.addCustomerPersonalDetails(accountNumber, firstname, lastname, address, contactNo, dateOfBirth, email);

	        model.addAttribute("message", "Customer added successfully ✅");
	    } catch (Exception ex) {
	        model.addAttribute("error", "Something went wrong while adding the customer!");
	    }
	    return "adminaddcustomer";
	}

	@GetMapping("/all")
	public String getAllCustomers(HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		try {
			List<Customer> getallCustomers = adminService.getallCustomers();
			List<CustomerAccountDetails> allCustomersPersonalDetails = adminService.getAllCustomersPersonalDetails();
			model.addAttribute("customerdetails", allCustomersPersonalDetails);
			model.addAttribute("customers", getallCustomers);
			long accountNumber = 0;
			String status = null;
			String password = null;
			for(Customer c: getallCustomers) {
				accountNumber = c.getAccountNumber();
				status = c.getStatus();
				password = c.getPassword();
			}
			model.addAttribute("accountNumber",accountNumber);
			model.addAttribute("status",status);
			model.addAttribute("password",password);
		}
		catch (Exception ex) {
			model.addAttribute("error", "Something went wrong while fetching the customers!");
		}
		return "admincustomerslist";
	}
	
	@PostMapping("/deletecustomer")
	public String deleteCustomer(
			@RequestParam("accountNumber") long accountNumber,
			@RequestParam("password") String password,
			@RequestParam("action") String action,
			HttpSession session,Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		Admin adminDetails = adminService.getAdminLoginDetails(admin.getEmail(), admin.getPassword());
		if(adminDetails == null)
		{
			session.invalidate();
			return "redirect:/flm/admin/adminlogin";
		}
		try {
			if("Delete".equalsIgnoreCase(action)) {
				adminService.deleteCustomer(action, accountNumber,password);
				model.addAttribute("message", "Customer deleted Successfully ✅");			
			}
		}
		catch(Exception ex) {
			model.addAttribute("error", "Something went wrong while deleting the customer!");
		}
		return "redirect:/flm/admin/customers/all";
	}
}
