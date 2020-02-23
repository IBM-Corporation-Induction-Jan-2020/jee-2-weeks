<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>--Welcome To Train Services--</h2>
	<br>
	<br>
	<h1>-----Train Details-----</h1>
	<table style="width: 25%">
		<tr>
			<th>S.No</th>
			<th>Train Name</th>
			<th>Cost Per Ticket</th>
		</tr>
		<tr>
			<td>1</td>
			<td>Satabdi Express</td>
			<td>100</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Doronto Express</td>
			<td>200</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Deccan Express</td>
			<td>300</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Royal Rajasthan Express</td>
			<td>400</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Rajdhani Express</td>
			<td>500</td>
		</tr>
	</table>
	
	<br><br>
	<form action="/calculateCost">
		Please provide Service details<br> Enter Ticket Quantity : <input
			type="text" name="rquant"> <br> Enter Train name : <input
			type="text" name="rtrain"> <br> <input type="submit"
			value="Create Ticket">
	</form>
</body>
</html>