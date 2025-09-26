<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resident Home Page</title>
</head>
<body>
<h4>Welcome <%= session.getAttribute("username") %></h4>
<h4>Complaint Form</h4>
<form action="complaints" method = "post">
Category:<input type = "category" name = category><br><br>
Description:<input type = "description" name = description><br><br>
Priority:<input type = "priority" name = "priority"><br><br>
Name:<input type = "name" name = name><br><br>
BlockName<input type = "Block" name = block><br><br>
FlatNo:<input type = "flatNo" name = flatNo><br><br>
Date Raised<input type = "dateraised" value = date><br><br>
<input type = "submit" value = Submit>
</form>
</body>
</html>