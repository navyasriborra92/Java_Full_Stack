package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.db.EmployeeDAO;
import com.model.Employee;

/**
 * Servlet implementation class EmploeeServlet
 */
@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO employeeDao = new EmployeeDAO();
		List<Employee> employeeList = employeeDao.getAllEmployees();
		request.setAttribute("emplist", employeeList);
		System.out.println(employeeList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
