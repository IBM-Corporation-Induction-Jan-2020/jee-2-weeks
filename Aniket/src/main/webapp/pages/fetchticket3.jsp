<%@page import="com.example.demo.Service"%>
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
		<h2>Ticket Details</h2>
		<h2>Id : </h2>
		<%Passenger png = (Passenger) request.getAttribute("pq");
		out.println(png.getId()); %><br><br>
		<h2>Name : </h2>
		<%	out.println(png.getName()); %><br><br>
		<h2>Mail : </h2>
		<%	out.println(png.getMail()); %><br><br>
		<h2>Tickets : </h2>
		<%	out.println(png.getTickets()); %><br><br>
		<% Service po =(Service) request.getAttribute("li") ;
		out.println(po); %>
		<h2>Cost : </h2>
		<% int cost = (Integer) request.getAttribute("cost");
		out.println(cost);%>
		<h2>Service Id : </h2>
		<%int ser =(int) (Math.random()*1000);
		out.println(ser);%>
		<form action="fetchuserchoice">
			<input type="submit" value="Return to User Choice">
		</form>
		
</body>
</html>