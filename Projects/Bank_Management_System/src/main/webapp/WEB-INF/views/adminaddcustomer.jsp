<%@ page import  = "com.model.Customer, java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add customer</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="container">
        <!-- Sidebar -->
        <div class="sidebar">
            <h2>Menu</h2>
            <a href="/Bank_Management_System/flm/admin/admindetails">Personal Details</a>
		    <div class="menu-item">
		        <a href="#" class="menu-toggle" onclick="toggleMenu(event)">Manage Customers ▼</a>
		        <div class="submenu">
		            <a href="/Bank_Management_System/flm/admin/customers/showcustomerform">Add Customer</a>
		            <a href="/Bank_Management_System/flm/admin/customers/all">View All Customers</a>
		        </div>
		    </div>
            <a href="/Bank_Management_System/flm/admin/loans/loanrequests">Loan Requests</a>
            <a href="/Bank_Management_System/flm/admin/reports">Reports</a>
            <a href="/Bank_Management_System/flm/admin/adminresetpassword">Reset Password</a>
            <a href="/Bank_Management_System/flm/admin/adminlogout">Logout</a>
        </div>

        <!-- Main content -->
        <div class="main-content">
            <div class="account-card">
				<form action = "/Bank_Management_System/flm/admin/customers/add" method = "post" onsubmit="return validateForm()">
				<h3>Add Customer Details</h3>
				 <label>Account Number:</label>
				    <input type="number" name="accountNumber" id="accountNumber" required><br><br>
				
				    <label>Password:</label>
				    <input type="password" name="password" id="password" required><br><br>
				
				    <label>Status:</label>
					<select name="status" id="status" required>
					    <option value="">--Select Status--</option>
					    <option value="registered">Registered</option>
					    <option value="unregistered">Unregistered</option>
					</select><br><br>
				
				    <label>First Name:</label>
				    <input type="text" name="firstname" id="firstname" required><br><br>
				
				    <label>Last Name:</label>
				    <input type="text" name="lastname" id="lastname" required><br><br>
				
				    <label>Address:</label>
				    <input type="text" name="address" id="address" required><br><br>
				
				    <label>Contact No:</label>
				    <input type="number" name="contactNo" id="contactNo" required><br><br>
				
				    <label>Date of Birth:</label>
				    <input type="date" name="dateOfBirth" id="dateOfBirth" required><br><br>
				
				    <label>Email:</label>
				    <input type="email" name="email" id="email" required><br><br>
				    
				    <input type="submit" value="Add Customer">

				</form>
				<c:choose>
		    <c:when test="${not empty message}">
		        <p class="message">${message}</p>
		    </c:when>
		    <c:when test="${not empty error}">
		        <p class="error">${error}</p>
		    </c:when>
		</c:choose>
            </div>
        </div>
    </div>
    <script>
function validateForm() {
    let accountNumber = document.getElementById("accountNumber").value.trim();
    let password = document.getElementById("password").value.trim();
    let status = document.getElementById("status").value.trim();
    let contactNo = document.getElementById("contactNo").value.trim();
    let email = document.getElementById("email").value.trim();

    // Basic checks
    if (accountNumber === "" || password === "" || status === "") {
        alert("Account Number, Password, and Status are required.");
        return false;
    }

    if (isNaN(contactNo) || contactNo.length < 10) {
        alert("Please enter a valid Contact Number.");
        return false;
    }

    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid Email address.");
        return false;
    }
    
    let status = document.getElementById("status").value;
    if (status === "") {
        alert("Please select a Status.");
        return false;
    }

    return true; // allow form submission
}
</script>
    
<script>
    
function toggleMenu(event) {
    event.preventDefault();
    const menuItem = event.target.closest('.menu-item');
    const submenu = menuItem.querySelector('.submenu');

    if (submenu.style.display === 'block') {
        submenu.style.display = 'none';
        event.target.innerText = "Manage Customers ▼";
    } else {
        submenu.style.display = 'block';
        event.target.innerText = "Manage Customers ▲";
    }
}
</script>
</body>
</html>