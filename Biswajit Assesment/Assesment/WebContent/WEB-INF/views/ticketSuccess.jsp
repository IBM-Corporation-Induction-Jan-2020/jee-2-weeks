<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Ticket Booking Successful</h1>
		<h2>Passenger Details:</h2>
		Name:<%=request.getAttribute("pName") %><br>
		Passenger ID: <%=request.getAttribute("pID") %><br>
		Passenger Email: <%=request.getAttribute("pMail") %><br>
		<h2>Service Booking Details:</h2>
		Service ID:<%=request.getAttribute("serviceID") %><br>
		Route:<%=request.getAttribute("sRoute") %><br>
		Route price per person:<%=request.getAttribute("rPrice") %><br>
		Number of tickets :<%=request.getAttribute("count") %><br><br>
		
		<h3>Total Price: <%=request.getAttribute("tPrice") %></h3>
		<h3>Thank You!!</h3>

</body>
</html>