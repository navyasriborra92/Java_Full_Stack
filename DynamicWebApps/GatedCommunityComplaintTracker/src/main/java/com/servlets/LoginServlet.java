package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.db.SignUpDAO;
import com.model.CommunityUser;
import com.model.ResidentDetails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		SignUpDAO signupdao = new SignUpDAO();
		boolean validateUser = signupdao.ValidateUser(username, password);
		ResidentDetails resident = signupdao.getResident(username, password);

		if(validateUser) {
			if(resident.getRole().equalsIgnoreCase("user")) {
				System.out.println(resident.getRole());
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("residenthome.jsp");
				requestDispatcher.forward(request, response);
			}
			else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminhome.jsp");
				requestDispatcher.forward(request, response);
			}				
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}
	}

}
