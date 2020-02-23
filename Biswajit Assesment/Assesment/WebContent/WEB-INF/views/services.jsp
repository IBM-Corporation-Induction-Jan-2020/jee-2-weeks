<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Here's the List of our services:</h1>
 	<h4>First Service:</h4>
    <%=request.getAttribute("Service1") %><br>
    
    <h4>Second Service:</h4>
    <%=request.getAttribute("Service2") %><br>
    
    <h4>Third Service:</h4>
    <%=request.getAttribute("Service3") %><br>
    <h4>Fourth Service</h4>
    <%=request.getAttribute("Service4") %><br>
    <h4>Fifth Service</h4>
    <%=request.getAttribute("Service5") %><br><br>
    
    Note: Kindly note the Service ID of the route for Booking Tickets<br>
    <a href="bookTickets">Click Here to Book Tickets</a>
    


</body>
</html>