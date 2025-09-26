<%@ page import= "java.util.* , com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>

<% List<Employee> emplist = (List<Employee>) request.getAttribute("emplist");
	for(Employee emp : emplist){
%>
<form action="updateemployee" method = "post"><br><br>
Name: <input type = "text" name = <%= emp.getName() %>><br><br>
Age: <input type = "number" name = "age"><br><br>
email: <input type = "email" name = "email"><br><br>
salary: <input type = "number" name = "salary"><br><br>
Phone_number: <input type = "number" name = "phone_number"><br><br>
<input type = "submit" value = "add"><br><br>
</form>
<%} %>	
</body>
</html>