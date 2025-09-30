<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body class = "login-page">
	
    <div class="login-card">
		<h1 style ="color : blue;">Welcome to FLM Bank</h1>
		<h3>Register</h3>
		<form action = "/Bank_Management_System/flm/admin/resetPassword" method = "post">
		Email : <input type = "email" name = "email"><br><br>
		Old Password : <input type = "password" name = "password"><br><br>
		New Password : <input type = "password" name = "newpassword"><br><br>
		Confirm Password : <input type = "password" name = "confirmpassword"><br><br>
		<input type = "submit" value = "Submit"><br><br>
		<a href = "/Bank_Management_System/flm/admin/adminlogin">Login</a>
		</form>

        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
    </div>

</body>
</html>
