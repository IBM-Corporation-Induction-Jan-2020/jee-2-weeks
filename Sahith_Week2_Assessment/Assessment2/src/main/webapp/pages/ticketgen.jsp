<%@page import="com.shetty.Services"%>
<%@page import="com.shetty.Passenger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Passenger Ticket Generated</h2><br>
<a href="/">Return to HomePage</a><br>
<%
	Passenger pasen =(Passenger) request.getAttribute("pmap");
	out.println("Passenger Id: "+pasen.getId());%><br><%
	out.println("Passenger Name: "+pasen.getName());%><br><%
	out.println("Passenger Email: "+pasen.getEmail());%><br><%
	%><br>
	<%
	Services serv =(Services) request.getAttribute("servmap");
	out.println("Route Number: "+serv.getRouteId());%><br><%
	out.println("Route Description: "+serv.getRouteDesc());%><br><%
	out.println("Route Cost: "+serv.getCost());%><br><%
	%>
	<%
	Integer tickets=(Integer)request.getAttribute("totalpasen");
	out.println("Total tickets Booked: "+tickets);
	%><br><br>
	<%
	Integer cost=(Integer)request.getAttribute("totalcost");
	out.println("Total Cost: "+cost);
	%>
</body>
</html>