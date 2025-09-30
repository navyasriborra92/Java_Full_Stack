<%@ page import  = "com.model.Customer, java.util.*" language="java" contentType="text/html; charset=UTF-8"
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
		            <a href="/Bank_Management_System/flm/admin/customers/all">   View All Customers</a>
		        </div>
		    </div>
            <a href="/Bank_Management_System/flm/admin/loans/loanrequests">Loan Requests</a>
            <a href="/Bank_Management_System/flm/admin/reports/show">Reports</a>
            <a href="/Bank_Management_System/flm/admin/adminresetpassword">Reset Password</a>
            <a href="/Bank_Management_System/flm/admin/adminlogout">Logout</a>
        </div>

        <!-- Main content -->
        <div class="main-content">
            <div class="account-card">
			<h3>Welcome, ${adminDetails.lastname}!</h3>
				<p>FirstName: ${adminDetails.firstname}</p>
                <p>Email: ${adminDetails.email}</p>
                <p>Address: ${adminDetails.address}</p>
                <p>DateOfBirth: ${adminDetails.dateOfBirth}</p>
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