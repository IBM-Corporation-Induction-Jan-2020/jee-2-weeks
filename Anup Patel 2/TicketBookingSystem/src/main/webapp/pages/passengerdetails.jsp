<%@page import="com.example.demo.Passenger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Passenger details</h2>
	<%
		Passenger pes = (Passenger) request.getAttribute("past");
		out.println(pes.getId());
		out.println(pes.getName());
		out.println(pes.getMail());
	%>
	
	<a href="homepage">Go back to homepage</a>

</body>
</html>