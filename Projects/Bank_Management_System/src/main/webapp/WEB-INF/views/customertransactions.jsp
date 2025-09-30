<%@ page import="com.model.*, java.util.*" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FLM Bank - Home</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<div class="container">
    <!-- Sidebar -->
    <div class="sidebar">
        <h2>Menu</h2>
        <a href="/Bank_Management_System/flm/home/accountdetails">Account Details</a>
        <a href="/Bank_Management_System/flm/transfer/fundstransfer">Transfer Money</a>
        <a href="/Bank_Management_System/flm/transactions/transactionsall">transactions</a>
        <div class="menu-item">
            <a href="#" class="menu-toggle" onclick="toggleMenu(event)"> Loans ▼</a>
            <div class="submenu">
                <a href="/Bank_Management_System/flm/loan/loanapplication">Loan Application</a>
                <a href="/Bank_Management_System/flm/loan/loanstatus">Loan Status</a>
            </div>
        </div>
        <a href="/Bank_Management_System/flm/user/resetPasswordForm">Reset Password</a>
        <a href="/Bank_Management_System/flm/user/logout">Logout</a>
    </div>

    <!-- Main content -->
    <div class="main-content">
        <div class="account-card">
            <p>Last Name: ${name}</p>
            <p>Account Number: ${accountNumber}</p>
            <p>Available Balance: $${availablebalance}</p>

            <h2 style="text-align:center">Transaction History</h2>

            <table>
                <thead>
                    <tr>
                        <th>Transaction ID</th>
                        <th><a href="?page=${currentPage}&sortField=localDateTime&sortDir=${reverseSortDir}">Date</a></th>
                        <th><a href="?page=${currentPage}&sortField=amount&sortDir=${reverseSortDir}">Amount</a></th>
                        <th>Recipient</th>
                        <th>Description</th>
                        <th>Transaction Type</th>
                        <th>Type</th>
                    </tr>
                </thead>
                <tbody>
                    <c:choose>
                        <c:when test="${not empty transactionPage.content}">
                            <c:forEach var="t" items="${transactionPage.content}">
                                <tr>
                                    <td>${t.transactionId}</td>
                                    <td>${t.localDateTime}</td>
                                    <td>$${t.amount}</td>
                                    <td>${t.upiId}</td>
                                    <td>${t.description}</td>
                                    <td>${t.transaction_type}</td>
                                    <td>${t.type}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td colspan="7" style="text-align:center">No transactions found.</td>
                            </tr>
                        </c:otherwise>
                    </c:choose>
                </tbody>
            </table>

            <!-- Pagination -->
            <div class="pagination">
                <c:if test="${totalPages > 1}">
                    <c:forEach begin="0" end="${totalPages - 1}" var="i">
                        <c:choose>
                            <c:when test="${i == currentPage}">
                                <b>${i + 1}</b>
                            </c:when>
                            <c:otherwise>
                                <a href="?page=${i}&sortField=${sortField}&sortDir=${sortDir}">${i + 1}</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </c:if>
            </div>

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
