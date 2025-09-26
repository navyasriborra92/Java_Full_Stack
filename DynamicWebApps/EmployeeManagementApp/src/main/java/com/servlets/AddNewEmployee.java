package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.db.EmployeeDAO;
import com.model.Employee;
import com.util.HibernateUtil;

/**
 * Servlet implementation class AddNewEmployee
 */
@WebServlet("/addnewemployee")
public class AddNewEmployee extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String phone_number = request.getParameter("phone_number");
		Employee emp = new Employee(name, age, email, salary, phone_number);
		
		EmployeeDAO empdao = new EmployeeDAO();
		empdao.addEmployee(emp);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
		requestDispatcher.forward(request, response);
		
	}

}
