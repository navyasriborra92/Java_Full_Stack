<%@ page import= "java.util.* , com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
<h4>Welcome <%= session.getAttribute("email") %></h4>
<a href= "addnewemployee.jsp">Add New Employee</a>
<table border = "1">
	<tr>
	<th>EmployeeID</th>
	<th>Name</th>
	<th>Age</th>
	<th>Email</th>
	<th>Salary</th>
	<th>Phone_Number</th>
	<th>Update</th>
	<th>Delete</th>
	</tr>
	
<% List<Employee> emplist = (List<Employee>) request.getAttribute("emplist");
	for(Employee emp : emplist){
%>
	<tr>
	<td><%= emp.getEmpid() %></td>
	<td><%= emp.getName() %></td>
	<td><%= emp.getAge() %></td>
	<td><%= emp.getEmail() %></td>
	<td><%= emp.getSalary() %></td>
	<td><%= emp.getPhone_number() %></td>
	<td><a href = update?empid= <%= emp.getEmpid()%>>Update Emp</a></td>
	<td> <a href= "delete?empid=<%= emp.getEmpid()%>">Delete Emp</a></td>
	</tr>
	
<%} %>	
</table>
</body>
</html>