<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>This is JSP page</h1>
	
	<%
	String name  = "Navya";
	out.println(name);
	
	%>
	<%= name %>
	
	<h1>Hi <%= name %> are you okay?</h1>
</body>
</html>