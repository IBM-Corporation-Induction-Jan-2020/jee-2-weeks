<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Ticket Info</h1>
   <a class="btn btn-primary btn-lg" href="Passenger.html" role="button">Home</a>
   
  </div>
</div>
<div class = "container">
<div class="card" style="width: 30rem;">
  <div class="card-body">
    <h3 class="card-title">Welcome <span><%= request.getAttribute("Name").toString().toUpperCase() %></span></h3>
    <h5 class="card-text"><%=request.getAttribute("Source") %> --- > <%= request.getAttribute("Destination") %></h5>
    <p class="card-text">Ticket Number --> <%= request.getAttribute("Ticket") %></p>
    <p class="card-text">Price --> <%= request.getAttribute("price") %></p>
  </div>
</div>
</div>
</body>
</html>