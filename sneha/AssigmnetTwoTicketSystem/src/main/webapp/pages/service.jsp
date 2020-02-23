<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.sneha.spring.boot.ticketsystem.Services"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-info text-black">
	<div class="container">
		<div class="card">
   			<div class="card-body">
   				<div class="jumbotron text-center">
					<h1>Service details</h1>
						<%
							Services[] service=(Services[]) request.getAttribute("sdetails");
	
							for(int i=0;i<5;i++)
							{
								out.println("---- Service ID : "+service[i].getId());
								out.println("---- Route : "+service[i].getRoute());
								out.println("---- Cost per seat : "+service[i].getCostPerSeat()+" ----");
								out.print("<br><br>");
							}
						%>
						<br><br>
						<a href="http://localhost:9090/" > Back </a>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>