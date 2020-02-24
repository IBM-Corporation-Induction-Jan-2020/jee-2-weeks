<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/bookingstatus">
 <font size="24" color="red">Please Enter the following your details</font><br><br>
 
  <h4>Enter  User-ID :-<input type="number" name="userId"></h4><br>
  <h4>Enter your BookingID :-<input type="number" name="bookingId"></h4><br>
  <h4>Enter Service-ID :-<input type="number" name="serviceId"></h4><br>
  <h4>Enter no of Tickets :-<input type="number" name="ticketCount"></h4><br>
  
  <input type="submit" value="Book Ticket">
 
 </form>
 <br>
 <h1>Note:-To check the Service-ID of your bus ,Check the below Link</h1><br>
 	<a href="http://localhost:8080/services">Routes Available</a><br>
 <br><a href="http://localhost:8080/">Back</a>
</body>
</html>