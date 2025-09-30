<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Funds Transfer Otp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<form action = "/Bank_Management_System/flm/transfer/fundstransferotp" method = "get">
Enter OTP: <input type = "submit" value = "Submit">
<h4 style="color: green;">${message}</h4>
<h4 style="color: red;">${error}</h4>
</form>
 <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
        
  <c:if test="${not empty message}">
            <p class="message">${message}</p>
        </c:if>

</body>
</html>