<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-success text-black">
	<div class="container">
		<div class="card">
   			<div class="card-body">
   				<div class="jumbotron text-center">
					<h1 class="text-success">Ticket Booked Details</h1>
					<%
							Object[] obj=(Object[]) request.getAttribute("details");
							/*for(Object temp : obj)
							{
								out.println(temp);
								out.print("<br>");
							}*/
							out.println("Name : "+obj[0]+"<br>");
							out.println("Route : "+obj[1]+"<br>");
							out.println("Total amount : "+obj[2]+"<br>");
							out.println("Generated ticket id : "+obj[3]+"<br>");
					%>
					<br><br>
					<a href="http://localhost:9090/" > Home </a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>