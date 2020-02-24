<%@page import="com.pranav.ticket.booking.Passenger"%>
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
	Passenger ps = (Passenger) request.getAttribute("User");
	out.println("Hi " + ps.getName() + ". Your UserID is " + ps.getId());
%><br>
<a href = "http://localhost:8080/">Click to go to home page</a>
</body>
</html>