<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import = "com.springboot.kaushal.booking.User"%>
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
    <h1 class="display-4">Ticket Generation</h1>
    <p class="lead">Give us the Required Information</p>
  </div>
</div>
<div class = "container">
<form method = "POST" action ="/genTicket">
  <div class="form-group">
    <label for="exampleInputEmail1">User Id</label>
    <input type="text" class="form-control" name ="id" aria-describedby="emailHelp">
   </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Ticket Number</label>
    <input type="text" class="form-control" name = "ticket">
  </div>
  <input type = "submit" class = "btn btn-primary" value ="Get Ticket!!">
</form>
<br>

</div>
</body>
</html>