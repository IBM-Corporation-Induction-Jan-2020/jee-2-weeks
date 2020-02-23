<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.khushboo.spring.boot.ticket.booking.app.Services"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.khushboo.spring.boot.ticket.booking.app.AvailableServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		
		ArrayList<Services> availServe = (ArrayList<Services>) request.getAttribute("serve");
	
		Iterator<Services> iter = availServe.iterator();
		
		while (iter.hasNext())
			out.println(iter.next() + "<br>");

	%>
	<br>
	<br>
	<br>
	
	<a href="pages/ticketBooking/bookTicket.html"><button>Book Tickets</button></a><br><br>
	<a href="pages/ticketBooking/homepage.html"><button>Go back to HomePage</button></a><br><br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<h3>** Please note the Service ID for booking tickets</h3>
		
</body>
</html>