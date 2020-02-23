<%@page import="com.pranav.ticket.booking.Services"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  Services[] svcs = (Services[]) request.getAttribute("serv"); 
		for(int i=0;i<svcs.length;i++)
		{
			out.println(svcs[i].getId() +" "+ svcs[i].getSrc() + "--" + svcs[i].getDest() + "Rs. " + svcs[i].getCost());
			out.print("<br>");
		}
	
	
	%>
	<a href = "http://localhost:8080/"> Click here to go to homepage</a>
</body>
</html>