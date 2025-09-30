<%@ page import  = "com.model.*, com.constants.*, java.util.*" language="java" contentType="text/html; charset=UTF-8"
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
				<h3 style="text-align:center">Loans</h3>
				
				<table border="1">
				    <thead>
				    <tr>
				        <th>Account_Number</th>
				        <th>LastName</th>
				        <th>ContactNo</th>
				        <th>LoanId</th>
				        <th>LoanType</th>
				        <th>EMI</th>
				        <th>EMI Duration</th>
				        <th>Amount</th>
				        <th>Status</th>
				    </tr>
				    </thead>
				    <tbody>
				        <%List<Loans> list= (List<Loans>) request.getAttribute("loans");
				        if (list != null && !list.isEmpty()) {
				        	for(Loans l: list){
							    %>
				        <tr>
				            <td><%= l.getCustomer().getAccountNumber() %></td>
				            <td><%= l.getCustomer().getCustomerAccountDetails().getLastname() %></td>
				            <td><%= l.getCustomer().getCustomerAccountDetails().getContactNo() %></td>
				            <td><%= l.getLoanId() %></td>
				            <td><%= l.getLoantype() %></td>
				            <td><%= l.getEmi() %></td>
				            <td><%= l.getEmiduration() %></td>
				            <td>$<%= l.getAmount() %></td>
				            <td><%= l.getStatus() %></td>
					        <%  } }%>
				            </td>
				        </tr>
					</tbody>
				</table>
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