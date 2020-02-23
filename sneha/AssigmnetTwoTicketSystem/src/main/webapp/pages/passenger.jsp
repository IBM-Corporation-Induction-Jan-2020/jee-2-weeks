<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-primary text-black">
	<div class="container">
		<div class="card">
   			<div class="card-body">
   				<div class="jumbotron text-center">
					<h1>Welcome new passenger</h1>
					<br>
					<form action="newPassenger" method="post">
							Please provide your details to register <br>
					<br>
							Enter name : <input type="text" name="pname"> <br><br>
							Enter mail : <input type="text" name="pmail"> <br><br>
							Enter ticket : <input type="text" name="pticket"> <br><br>
		
							<input type="submit" class="btn btn-primary" value="create passenger">
					</form>
					<br><br>
					<a href="http://localhost:9090/" > Back </a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>