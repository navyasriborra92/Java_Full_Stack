package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.db.DBConnection;
import com.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			DBConnection db = new DBConnection();
			User user = new User(email, password);
			try {
				boolean validateUser = db.validateUser(user); 
				if(validateUser)
				{
					HttpSession session = request.getSession();
					String name = user.getEmail().split("@")[0];
					session.setAttribute("email", name);
					
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
				requestDispatcher.forward(request, response);
				}
				else {
					response.setContentType("text/html");
					PrintWriter writer = response.getWriter();
					writer.println("<h3>Incorrect email/password</h3>");
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
					requestDispatcher.forward(request, response);
				}
			} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}
