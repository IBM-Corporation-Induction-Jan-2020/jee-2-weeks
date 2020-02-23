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
<h2>Passenger Creation Successful</h2>
  <%
	Passenger pass =(Passenger) request.getAttribute("passen");
	out.println(pass);
	%> <br><br><br>
	
	<a href="/">Return to Home Page</a>
  
</body>
</html>