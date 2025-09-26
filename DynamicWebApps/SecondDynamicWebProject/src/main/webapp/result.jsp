<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String user = (String)request.getAttribute("user");
String pwd = (String)request.getAttribute("password");
%>

<h1>Hi <%= user %> you are signed up</h1>
<h2>Don't expose your password <%= pwd %></h2>
</body>
</html>