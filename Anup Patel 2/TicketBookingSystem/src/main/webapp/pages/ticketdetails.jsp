<%@page import="com.example.demo.Ticket"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Ticket details</h2>
	<%
		Ticket pes = (Ticket) request.getAttribute("ticket");

		out.println("Train Name:");
		out.println(pes.getTname());
		
		out.println("Departure Station Name:");
		out.println(pes.getDstation());

		out.println("Arrival Station Name:");
		out.println(pes.getAstation());

		out.println("Number of tickets:");
		out.println(pes.getQuant());

		out.println("Total Cost:");
		out.println(pes.getCost());
	%>
	<br>
	<br>
	<a href="homepage">Go back to homepage</a>
</body>
</html>