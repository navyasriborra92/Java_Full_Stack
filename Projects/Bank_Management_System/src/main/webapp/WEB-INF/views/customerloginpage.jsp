<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
<link rel="stylesheet" href="/Bank_Management_System/resources/css/style.css">
</head>
<body class="login-page">
	
    <div class="login-card">
    <h1 style="color: blue;">Welcome to FLM Bank</h1>
        <h2>Login</h2>
		<form action = "/Bank_Management_System/flm/user/loginpage" method = "get">
		Account Number : <input type = "text" name = "accountNumber"><br><br>
		Password : <input type = "password" name = "password"><br><br>
		<input type = "submit" value = "Login"><br><br>
		<p>Are you a first time user? Please <a href= "/Bank_Management_System/flm/user/resetPasswordForm">Register</a></p>
		<a href = "/Bank_Management_System/flm/admin/adminlogin">Admin</a>
		</form>

				<c:choose>
		    <c:when test="${not empty error}">
		        <p class="message">${resetmessage}</p>
		    </c:when>
		    <c:when test="${not empty error}">
		        <p class="error">${error}</p>
		    </c:when>
		</c:choose>

    </div>

</body>
</html>
