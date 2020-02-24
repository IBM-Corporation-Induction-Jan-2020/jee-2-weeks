<%@page import="com.example.demo.Service"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/ServiceDetails"> 
 <h1> Details are as follows</h1>
 <h5> service_id  from  to cost  number_of_available_seats </h5>
 <% Service serv=(Service ) request.getAttribute("service-0");
out.println(serv.getServiceId()+"\n");
out.println(serv.getFromCity()+"\n");
out.println(serv.getToCity()+"\n");
 out.println(serv.getCost()+"\n");
 out.println(serv.getNoOfAvailableSeats());
   %> 
   <br>
   <br>
   <% Service serv1=(Service ) request.getAttribute("service-1");
out.println(serv1.getServiceId()+"\n");
out.println(serv1.getFromCity()+"\n");
out.println(serv1.getToCity()+"\n");
 out.println(serv1.getCost()+"\n");
 out.println(serv1.getNoOfAvailableSeats());
   %> 
   <br>
   <% Service serv2=(Service ) request.getAttribute("service-2");
out.println(serv2.getServiceId()+"\n");
out.println(serv2.getFromCity()+"\n");
out.println(serv2.getToCity()+"\n");
 out.println(serv2.getCost()+"\n");
 out.println(serv2.getNoOfAvailableSeats());
   %> 
    <br>
   <% Service serv3=(Service ) request.getAttribute("service-3");
out.println(serv3.getServiceId()+"\n");
out.println(serv3.getFromCity()+"\n");
out.println(serv3.getToCity()+"\n");
 out.println(serv3.getCost()+"\n");
 out.println(serv3.getNoOfAvailableSeats());
   %> 
    <br>
   <% Service serv4=(Service ) request.getAttribute("service-4");
out.println(serv4.getServiceId()+"\n");
out.println(serv4.getFromCity()+"\n");
out.println(serv4.getToCity()+"\n");
 out.println(serv4.getCost()+"\n");
 out.println(serv4.getNoOfAvailableSeats());
   %> 
 </form>
</body>
</html>