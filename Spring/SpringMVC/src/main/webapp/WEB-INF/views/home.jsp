<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hi Welcome ${name}!!!</h1>
<form action = "signup" method = "post">
Email:<input type = "text" name = "email">
Password:<input type = "password"name = "password">
<input type = "submit"value = "signup">
</form>
</body>
</html>