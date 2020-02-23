<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-secondary text-black">
	<div class="container">
		<div class="card">
   			<div class="card-body">
   				<div class="jumbotron text-center">
					<h1>Welcome passenger</h1>
					<br>
					<form action="newTicket" method="post">
							Please provide the details <br>
							<br>
							Enter passenger id : <input type="text" name="pid"> <br><br>
							Enter service id : <input type="text" name="sid"> <br><br>
							Enter no of seats : <input type="text" name="pseats"> <br><br>
		
							<input type="submit" class="btn btn-info" value="generate ticket">
					</form>
					<br><br>
					<a href="http://localhost:9090/" > Back </a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>