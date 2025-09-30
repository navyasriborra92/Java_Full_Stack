<%@ page import  = "com.model.Customer, java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FLM Bank - Home</title>
</head>
<link rel="stylesheet" href="/Bank_Management_System/resources/css/style.css">
</head>
<body>
    <div class="container">
        <!-- Sidebar -->
        <div class="sidebar">
            <h2>Menu</h2>
            <a href="/Bank_Management_System/flm/home/accountdetails">Account Details</a>
            <a href="/Bank_Management_System/flm/transfer/fundstransfer">Transfer Money</a>
            <a href="/Bank_Management_System/flm/transactions/transactionsall">Transactions</a>
            <div class="menu-item">
		        <a href="#" class="menu-toggle" onclick="toggleMenu(event)"> Loans ▼</a>
		    	<div class="submenu">
		            <a href="/Bank_Management_System/flm/loan/loanapplication">   Loan Application</a>
		            <a href="/Bank_Management_System/flm/loan/loanstatus">   Loan Status</a>
		        </div>
		    </div>
            <a href="/Bank_Management_System/flm/user/resetPasswordForm">Reset Password</a>
            <a href="/Bank_Management_System/flm/user/logout">Logout</a>
        </div>
        
            <!-- Top Right Corner -->
    	<div class="top-right">
        	<p>Welcome, ${name}</p> 
        	<p>Account Number: ${accountNumber}</p>
    	</div>

        <!-- Main content -->

		<div class="main-content">
            <div class="account-card">
                <form action="/Bank_Management_System/flm/transfer/transferfunds" method = "post" onsubmit="return validateTransferForm()">
               <h2 style="text-align: center;">UPI Transfer</h2>
               <h3>Account Number : ${accountNumber}</h3>
               <h3>Available Balance : $${availablebalance}</h3>
                Amount: $ <input type = "text" id = "name" name = "amount"><br><br>
                Name: <input type = "text" id = "name" name = "name"><br><br>
                UPI ID: <input type = "email" id = "upiId" name = "upiId"><br><br>
                <button type="submit" value="transfer">Transfer</button>
    			<button type="button" class ="cancel-btn" onclick="window.history.back();">Cancel</button><br><br>
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
function validateTransferForm(){
	let amount = document.getElementById("amount").value.trim();
	let name = document.getElementById("name").value.trim();
	let upiId = document.getElementById("upiId").value.trim();
	let availablebalance = parseFloat("${availablebalance}") || 0;
	
	if(parseFloat(amount) <= 0 || amount === "" || isNaN(amount)){
		alert("amount cannot be zero, please enter the valid amount");
		return false;
	}
	
	if(parseFloat(amount) > availablebalance){
		alert("Insufficient Balance, please enter valid amount");
		return false;
	}
	
	if(upiId === null){
		alert("Upi Id cannot be empty, please enter valid upiId");
		return false;
	}
	
    if (name === "") {
        alert("Name cannot be empty.");
        return false;
    }
	return true;
}
</script>
<script>    
	function toggleMenu(event) {
	    event.preventDefault();
	    const menuItem = event.target.closest('.menu-item');
	    const submenu = menuItem.querySelector('.submenu');
	
	    if (submenu.style.display === 'block') {
	        submenu.style.display = 'none';
	        event.target.innerText = "Loans ▼";
	    } else {
	        submenu.style.display = 'block';
	        event.target.innerText = "Loans ▲";
	    }
	}
</script>
</body>
</html>