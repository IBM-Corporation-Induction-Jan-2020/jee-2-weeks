<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Id : 1, Bangalore-Chennai, 6hrs, 1200</h2><br>
<h2>Id : 2, Delhi-Shimla, 8hrs, 3000</h2><br>
<h2>Id : 3, Delhi-Chandigarh, 4hrs, 500</h2><br>
<h2>Id : 4, Chandigarh-Shimla, 3hrs, 1800</h2><br>
<h2>Id : 5, Bangalore-Mumbai, 12hrs, 5600</h2>
<form action="/fetchticket">
Enter Id number to select Bus : <input type="number" name="uticket"><br>
Enter the number of Tickets you want to buy : <input type="text" name="ucount">
<input type="submit" value="Fetch ticket details">
</form>
</body>
</html>