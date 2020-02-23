<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron">
  <h1 class="display-4">Ticket Booking</h1>
  <p class="lead">Welcome to The booking Next Step</p>
  <hr class="my-4">
  <p>Tell Me your Confirmation </p>
  <span><a class="btn btn-success btn-lg" href="/generated" role="button">Confirm</a></span>
  <span><a class="btn btn-danger btn-lg" href="/generated" role="button">Cancel</a></span>
</div>
<div class = "container">
<div class="card" style="width: 30rem;">
  <div class="card-body">
    <h3 class="card-title">Welcome <span><%= request.getAttribute("Name").toString().toUpperCase() %></span></h3>
    <p class="card-text">Generated Ticket Number --> <%= request.getAttribute("Ticket") %></p>
    <p class="card-text">Excpected Amount --> <%= request.getAttribute("price") %></p>
  </div>
</div>
</div>
</body>
</html>