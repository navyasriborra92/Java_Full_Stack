<%@ page import  = "com.model.*, java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FLM Bank - Home</title>
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
		        <a href="#" class="menu-toggle" onclick="toggleMenu(event)"> >Manage Customers ▼</a>
		        <div class="submenu">
		            <a href="/Bank_Management_System/flm/admin/customers/showcustomerform">   Add Customer</a>
		            <a href="/Bank_Management_System/flm/admin/customers/all">   View All Customers</a>
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
                
				<h3>Customers List</h3>
				
				<table border="1">
				    <thead>
				    <tr>
				        <th>Account_Number</th>
				        <th>Status</th>
				        <th>FirstName</th>
				        <th>LastName</th>
				        <th>DateOfBirth</th>
				        <th>ConatctNo</th>
				        <th>Email</th>
				        <th>Address</th>
				        <th>Action</th>
				    </tr>
				    </thead>
				    <tbody>
				        <%List<CustomerAccountDetails> list= (List<CustomerAccountDetails>) request.getAttribute("customerdetails");
				        if (list != null && !list.isEmpty()) {
				        	for(CustomerAccountDetails t: list){
							    %>
				        <tr>
				            <td>${accountNumber}</td>
				            <td>${status}</td>
				            <td><%= t.getFirstname() %></td>
				            <td><%= t.getLastname() %></td>
				            <td><%= t.getDateofbirth() %></td>
				            <td><%= t.getContactNo() %></td>
				            <td><%= t.getEmail() %></td>
				            <td><%= t.getAddress() %></td>
				            <td>
				            <form method="post" action="/Bank_Management_System/flm/admin/customers/deletecustomer">
				            		<input type="hidden" name="accountNumber" value="${accountNumber}" />
				            		<input type="hidden" name="password" value="${password}" />
			                        <button type="submit" name="action" value="Delete">Delete</button>
			                    </form>
				            </td>
				        </tr>
				        <% } }
				        else{ %>
				    </tbody>
				</table> 
				<tr>
					<td colspan="3">No Customers found.</td>
				</tr>
						<%} %> 
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