<%@page import="com.shetty.Services"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Available Services</h1><br>
<a href="/">Return to Home Page</a><br>
<h2>Route 1</h2>
	<%
	Services serv1 =(Services) request.getAttribute("Bangalore -> Mangalore");
	out.println("Route Number: "+serv1.getRouteId());%><br><%
	out.println("Route Description: "+serv1.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv1.getCost());%><br><%
	%><br><br>
<h2>Route 2</h2>
	<%
	Services serv2 =(Services) request.getAttribute("Bangalore -> Chennai");
	out.println("Route Number: "+serv2.getRouteId());%><br><%
	out.println("Route Description: "+serv2.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv2.getCost());%><br><%
	%><br><br>
<h2>Route 3</h2>
	<%
	Services serv3 =(Services) request.getAttribute("Bangalore -> Pune");
	out.println("Route Number: "+serv3.getRouteId());%><br><%
	out.println("Route Description: "+serv3.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv3.getCost());%><br><%
	%><br><br>
<h2>Route 4</h2>
	<%
	Services serv4 =(Services) request.getAttribute("Bangalore -> Dharwad");
	out.println("Route Number: "+serv4.getRouteId());%><br><%
	out.println("Route Description: "+serv4.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv4.getCost());%><br><%
	%><br><br>
<h2>Route 5</h2>
	<%
	Services serv5 =(Services) request.getAttribute("Bangalore -> Kerala");
	out.println("Route Number: "+serv5.getRouteId());%><br><%
	out.println("Route Description: "+serv5.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv5.getCost());%><br><%
	%><br><br>
</body>
</html>