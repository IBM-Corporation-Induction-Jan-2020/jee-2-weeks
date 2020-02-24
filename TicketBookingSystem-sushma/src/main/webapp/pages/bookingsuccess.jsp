<%@page import="com.example.demo.Ticket"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Ticket Successfully Booked</h1>

<h1> <% out.print(request.getAttribute("wronginput")); %></h1>
<%  Ticket ticket=(Ticket) request.getAttribute("ticketbooked");
 out.println("Booking id :"+ticket.getTicketId()+"\n");
out.println(" user id :"+ticket.getUserid()+"\n");
out.println("Service id :"+ticket.getServiceid()+"\n");
 out.println(" from :"+ticket.getFromCity()+"\n");
  out.println("Date :"+ticket.getDate());
 out.println(" to :"+ticket.getToCity()+"\n");
 out.println(" Total cost :"+ticket.getCost()+"\n");
 out.println(" Number of seats : "+ticket.getNumberOfSeats());
   %> 
</body>
</html>
