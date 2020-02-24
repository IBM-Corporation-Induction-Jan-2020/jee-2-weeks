<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		<h1>Passenger Creation Successful!!</h1>
		Gen Passenger ID :<%=request.getAttribute("pid") %><br>
		
		Passenger name : <%=request.getAttribute("pname") %><br>
		
		Passenger mail-id: <%=request.getAttribute("pmail") %><br><br>
		
		Note:Rememeber your ID for future transactions<br>
		
		<a href="viewServices">View our Services</a><br>
	    <a href="bookTickets">Click Here to Book tickets</a>
		

		
</body>
</html>