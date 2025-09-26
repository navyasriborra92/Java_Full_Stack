package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.db.SignUpDAO;
import com.model.ResidentDetails;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String block = request.getParameter("block");
		int FlatNo = Integer.parseInt(request.getParameter("FlatNo"));
		String role = request.getParameter("role");
		String password = request.getParameter("password");
		
		SignUpDAO signupdao = new SignUpDAO();
		signupdao.saveResident(new ResidentDetails(username, name, age, block, FlatNo, role, password));
//		signupdao.ValidateUser(null);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
	}

}
