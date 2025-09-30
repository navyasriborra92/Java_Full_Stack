<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Admin Login</title>
<link rel="stylesheet" href="/Bank_Management_System/resources/css/style.css">
</head>
<body class="login-page">
	
    <div class="login-card">
    <h1 style="color: blue;">Welcome to FLM Bank</h1>
        <h2>Admin Login</h2>
		<h4 style="color: red;">${error}</h4>
		<form action = "/Bank_Management_System/flm/admin/adminhome" method = "get">
		Email : <input type = "text" name = "email"><br><br>
		Password : <input type = "password" name = "password"><br><br>
		<input type = "submit" value = "Login"><br><br>

		</form>

        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
    </div>

</body>
</html>
