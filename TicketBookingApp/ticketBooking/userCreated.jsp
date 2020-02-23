<%@page import="com.khushboo.spring.boot.ticket.booking.app.AppUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>
		<center>User Created Successfully!!</center>
	</h2>

	<%
		AppUser user = (AppUser) request.getAttribute("use");
		out.println("User Name : " + user.getName());
	%>
	<br>
	<br>
	<%
		out.println("User EMail ID : " + user.geteMail());
	%>
	<br>
	<br>
	<%
		out.println("Booked Tickets : " + user.getTicket());
	%>
	<br>
	<br>
	<h3>Generated id for ref: <%=request.getAttribute("gID") %></h3>
	<br>
	<a href="/getServices"><button>See Services Available</button></a>
	<br>
	<br>
	<a href="pages/ticketBooking/bookTicket.html"><button>Book Tickets</button></a>
</body>
</html>