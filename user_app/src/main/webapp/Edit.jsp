<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.user.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Navbar.jsp" %>
	<h1>Edit Page</h1>
	<% User u = (User) application.getAttribute("user"); %>
	
	<%if(u!=null){ %>
	<form action="update" method="post">
		
		User Id :<input type="number" name="userId" value="<%= u.getUserId()%>" readonly>
		User Name :<input type="text" name="username" value="<%= u.getUsername() %>">
		City :<input type="text" name="city" value="<%= u.getCity() %>">
		Email :<input type="email" name="email" value="<%= u.getEmail() %>">
		Password :<input type="text" name="pass" value="<%= u.getPassword() %>">
		
		<button type="submit">Submit</button>
	</form>
	<%} else{ %>
		<h3 style="color:red;">User Not Found</h3>
	<%} %>
	
</body>
</html>