<%@ page import= "java.util.* , com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaints History</title>
</head>
<body>
<h4>Complaints History Page</h4>

<table border = "1">
	<tr>
	<th>ComplaintID</th>
	<th>Name</th>
	<th>Block</th>
	<th>FlatNo</th>
	<th>Category</th>
	<th>Description</th>
	<th>Priority</th>
	<th>DateRaised</th>
	</tr>
	
<% List<Complaints> complaintsList = (List<Complaints>) request.getAttribute("residentComplaints");
	for(Complaints comp : complaintsList){
%>
	<tr>
	<td><%= comp.getComplaintId() %></td>
	<td><%= comp.getName() %></td>
	<td><%= comp.getBlock() %></td>
	<td><%= comp.getFlatNo() %></td>
	<td><%= comp.getCategory() %></td>
	<td><%= comp.getDescription() %></td>
	<td><%= comp.getPriority() %></td>
	<td><%= comp.getDateRaised() %></td>
	<td><a href = update?complaintid= <%= comp.getComplaintId()  %>>Update ComplaintId</a></td>
	<td> <a href= "status?empid=<%= comp.getComplaintId()  %>">Complaint Status</a></td>
	</tr>
	
<%} %>	
</table>
</body>
</html>