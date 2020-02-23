<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">TICKET BOOKING</h1>
			<p class="lead">Let Us Know Something About Yourself!!</p>
		</div>
	</div>
	<div class="container">

		<form method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" name="email"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">FullName</label> <input
					type="text" class="form-control" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Source</label> <input type="text"
					class="form-control" name="source">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Destination</label> <input
					type="text" class="form-control" name="destination">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Quantity</label> <input
					type="text" class="form-control" name="quan">
			</div>
			<div>
				<input type="submit" class="btn btn-primary" value="BOOK">
				<button class="btn btn-danger">
					<a href="Passenger.html" style="color: white;">Cancel
				</button>
				</a>
			</div>
		</form>
		<br>
	</div>

</body>
</html>