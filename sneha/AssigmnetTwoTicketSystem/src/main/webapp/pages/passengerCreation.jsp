<%@page import="com.sneha.spring.boot.ticketsystem.Passenger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger Creation Success Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-success text-black">
	<div class="container">
		<div class="card">
   			<div class="card-body">
   				<div class="jumbotron text-center">
					<h1 class="text-success">Passenger Created Details</h1>
					<%
							Passenger p=(Passenger) request.getAttribute("pdetails");
							out.println("Id : "+p.getId()+"<br>");
							out.println("Name : "+p.getName()+"<br>");
							out.println("Email id : "+p.getMail()+"<br>");
							out.println("Tickets : "+p.getTickets()+"<br>");
					%>
					<br>
					<a href="http://localhost:9090/" > Home </a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>