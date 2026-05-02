<%@page import="com.user.dto.User"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<style>
body{
    color: white;
    background-color: #1e1e2f;
    font-family: Arial, sans-serif;
}

/* Center heading */
h1{
    text-align: center;
    margin-bottom: 20px;
}

/* Center table */
.table-container{
    display: flex;
    justify-content: center;
}

/* Table styling */
table{
    border-collapse: collapse;
    width: 70%;
    background-color: #2c2c3e;
    box-shadow: 0 8px 20px rgba(0,0,0,0.5);
    border-radius: 10px;
    overflow: hidden;
    
    color:white;
}

/* Table header */
th{
    background-color: #4CAF50;
    padding: 12px;
}

/* Table data */
td{
    padding: 10px;
    text-align: center;
}

/* Row hover effect */
tr:hover{
    background-color: #3a3a50;
}

/* Action links */
a{
    color: #00d4ff;
    text-decoration: none;
    margin: 0 5px;
}

/* Space between table and form */
.form-container{
    margin-top: 80px;
    display: flex;
    justify-content: center;
}

/* Form styling */
form{
    background-color: #2c2c3e;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 6px 15px rgba(0,0,0,0.4);
    display: flex;
    flex-direction: column; /* input above button */
    gap: 10px;
    width: 250px;
}

/* Input field */
input[type="number"]{
    padding: 8px;
    border-radius: 5px;
    border: none;
}

/* Submit button */
input[type="submit"]{
    padding: 10px;
    border: none;
    background-color: #4CAF50;
    color: white;
    border-radius: 5px;
    cursor: pointer;
}

input[type="submit"]:hover{
    background-color: #45a049;
}

/* Base button style */
.btn{
    padding: 6px 12px;
    border-radius: 5px;
    text-decoration: none;
    color: white;
    font-size: 14px;
    display: inline-block;
    transition: 0.3s ease;
}

/* Edit button */
.edit-btn{
    background-color: #2196F3;
}

.edit-btn:hover{
    background-color: #1976D2;
}

/* Delete button */
.delete-btn{
    background-color: #f44336;
}

.delete-btn:hover{
    background-color: #d32f2f;
}
</style>
</head>
<body>
<%@ include file="Navbar.jsp" %>
	<h1> User Dashboard</h1>
	<div class="table-container">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>City</th>
			<th>EMAIL</th>
			<th>ACTION</th>
		</tr>
		<%
			List<User> ulist = (List<User>)request.getAttribute("users");
			for(User user:ulist)
			{
		%>
		<tr>
			<td><%= user.getUserId() %></td>
			<td><%= user.getUsername() %></td>
			<td><%= user.getCity() %></td>
			<td><%= user.getEmail() %></td>
			<td>
				<a class="btn edit-btn" href="edit?uid=<%=  user.getUserId() %>">Edit</a> 
				<a class="btn delete-btn" href="Delete?uid=<%=  user.getUserId() %>">Delete</a>
			</td>
		</tr>
		<%} %>
	</table>
	</div>
	
	<div class="form-container">
	<form action="getUserById">
		<input type="number" name="uid" >
		<input type="submit" value="getUserById">
	</form>
	</div>

	
	
</body>
</html>