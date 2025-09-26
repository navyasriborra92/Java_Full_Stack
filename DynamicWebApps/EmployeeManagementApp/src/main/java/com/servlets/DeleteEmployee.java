package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.db.EmployeeDAO;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete")
public class DeleteEmployee extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String empidStr = request.getParameter("empid");

	    if (empidStr == null || empidStr.isEmpty()) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing or empty empid parameter");
	        return;
	    }

	    int empid;
	    try {
	        empid = Integer.parseInt(empidStr);
	    } catch (NumberFormatException e) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid empid parameter");
	        return;
	    }

	    EmployeeDAO employeedao = new EmployeeDAO();
	    employeedao.deleteEmployee(empid);
	    
	    response.sendRedirect("employees");
//
//	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
//	    requestDispatcher.forward(request, response);
	}

}
