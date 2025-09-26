package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.db.ComplaintsDAO;
import com.model.Complaints;

/**
 * Servlet implementation class ComplaintsServlet
 */
@WebServlet("/complaints")
public class ComplaintsServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String name = request.getParameter("name");
		String block = request.getParameter("block");
		int flatNo = Integer.parseInt(request.getParameter("flatNo"));
		String dateraised = request.getParameter("dateraised");
		
		int residentId = Integer.parseInt(request.getParameter("residentId"));
		
		Complaints complaints = new Complaints(category, description, priority, name, block, flatNo, dateraised, residentId);
		
		ComplaintsDAO complaintsDAO = new ComplaintsDAO();
		complaintsDAO.saveComplaints(complaints);
		List<Complaints> residentComplaints = complaintsDAO.getResidentComplaints(name);
		request.setAttribute("residentComplaints", residentComplaints);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("complaintshistory.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
