<%@ page import  = "com.model.*, java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		            <a href="/Bank_Management_System/flm/admin/customers">   View All Customers</a>
		        </div>
		    </div>
            <a href="/Bank_Management_System/flm/admin/loanrequests">Loan Requests</a>
            <a href="/Bank_Management_System/flm/admin/reports/show">Reports</a>
            <a href="/Bank_Management_System/flm/admin/adminresetpassword">Reset Password</a>
            <a href="/Bank_Management_System/flm/admin/adminlogout">Logout</a>
        </div>

        <!-- Main content -->
        <div class="main-content">
            <div class="account-card">
                
				<h3>Loan Requests List</h3>
				
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
				        <th>Approve/Decline</th>
				    </tr>
				    </thead>
				    <tbody>
				        <%List<Loans> list= (List<Loans>) request.getAttribute("loanRequests");
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
				            <td><%= l.getAmount() %></td>
				            <td><%= l.getStatus() %></td>
				            <td>
							<% if ("Applied".equalsIgnoreCase(l.getStatus())) { %>
			                    <form method="post" action="/Bank_Management_System/flm/admin/loans/updaterequests">
			                        <input type="hidden" name="loanId" value="<%= l.getLoanId() %>" />
			                        <button type="submit" name="action" value="Approve">Approve</button>
			                        <button type="submit" name="action" value="Decline">Decline</button>
			                    </form>
					        <% } else { %>
					            <p>Loan <%= l.getStatus() %> ✔</p>
					        <% } } }%>
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
        event.target.innerText = "Manage Customers ▼";
    } else {
        submenu.style.display = 'block';
        event.target.innerText = "Manage Customers ▲";
    }
}
</script>
</body>
</html>