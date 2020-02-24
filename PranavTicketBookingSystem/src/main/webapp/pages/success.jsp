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
		
	String[] op = (String[]) request.getAttribute("output");
out.println("Hi "+ op[1]+ ", Your Transaction ID is " + op[2] + " Total Cost is Rs." + op[3]+ " ");
out.println("Source : " + op[4] + "Destination : " + op[5]  );
	

		%><a href = "http://localhost:8080/">Click to go to home page</a>
</body>
</html>