<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="status-box">
   
		<c:choose>
		    <c:when test="${not empty transfermessage}">
		        <p class="transfermessage" style = "color:green">${transfermessage}</p>
		    </c:when>
		    <c:when test="${not empty error}">
		        <p class="error" style = "color:red">${error}</p>
		    </c:when>
		</c:choose> 
		<a href="/Bank_Management_System/flm/home/accounthomepage">Home</a>
	</div>
</body>
</html>