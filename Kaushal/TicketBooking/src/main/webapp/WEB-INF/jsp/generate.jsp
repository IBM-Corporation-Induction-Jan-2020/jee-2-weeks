<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "com.springboot.kaushal.booking.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your generated ticket </h1>
<br>
<br>
<br>
<h1>Your ticket Number Details ARE</h1><br>
<% User pass = (User)request.getAttribute("user"); 
   out.println("Ticket Number :"+ pass.getTicket_number());
   out.println("Name :" + pass.getName());
   out.println("Source : " + pass.getSource());
   out.println("Destination :" + pass.getDestination());%>

</body>
</html> 