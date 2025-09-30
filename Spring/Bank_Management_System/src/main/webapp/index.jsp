<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <style>
        /* Set full-page background color */
        body {
            background-color: #f2f2f2;       /* light gray background */
            display: flex;
            justify-content: center;         /* horizontally center */
            align-items: center;             /* vertically center */
            height: 100vh;                   /* full viewport height */
            margin: 0;
            font-family: Arial, sans-serif;
        }

        /* Center form slab */
        .login-card {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.2);
            width: 300px;
            text-align: center;
        }

        .login-card h2 {
            margin-bottom: 20px;
        }

        .login-card input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .login-card input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        .login-card input[type="submit"]:hover {
            background-color: #45a049;
        }

        .error {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>
	
    <div class="login-card">
    <h1 style="color: blue;">FLM Bank</h1>
		<h4 style="color: red;">${error}</h4>
		<a href = "/Bank_Management_System/flm/user/login">Customer</a><br><br>
		<a href = "/Bank_Management_System/flm/admin/adminlogin">Admin</a>
		</form>

        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
    </div>

</body>
</html>
