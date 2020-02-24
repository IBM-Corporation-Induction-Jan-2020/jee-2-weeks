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
<h1> Details are as follows</h1>
<% Passenger air=(Passenger) request.getAttribute("passenger");
out.println(air.getId()+"\n");
out.println(air.getName()+"\n");
out.println(air.getMail()+"\n");
 out.println(air.getTickets()+"\n");
   %>  
</body>
</html>