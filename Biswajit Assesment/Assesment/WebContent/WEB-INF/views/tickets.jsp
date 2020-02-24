<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Ticket Generation Portal:</h1>
		<form action="newTicket" method = "post">
		Enter your Passenger Id: <input type = "number" name = "pID"> <br>
		Enter the Service Id you wish to book : <input type = "number" name = "serviceID"> <br>
		Enter count of tickets required: <input type = "number" name = "count"><br>
		
		<input type="submit" value="Submit">
	
	</form>

</body>
</html>