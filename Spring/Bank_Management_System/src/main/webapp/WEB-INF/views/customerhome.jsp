<%@ page import  = "com.model.Customer, java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

        <!-- Main content -->

		<div class="main-content">
            <div class="account-card">
                <h3>Welcome ${accountdetails.firstname}!</h3> 
                <p>Account Number: ${accountdetails.customer.accountNumber}</p> 
                <p>Available Balance : $${availablebalance}</p>          
            </div>
        </div>	
    </div>
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