<%@page import="com.example.demo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font size="24" color="green">User Creation Successful</font>
	
	<h3><%
		User us = (User) request.getAttribute("userobject");
		out.println("The record for "+us.getName()+" is created sucessfully\n");
		out.println(",Your ID is "+us.getId());
	%></h3>
	
	<h3>BookingID :  <%=request.getAttribute("bookingid") %></h3><br>
	<h2>Do not Share your BookingID. This ID is used to book Tickets</h2>
	<br><br><a href="http://localhost:8080/">Back</a>
</body>
</html>