<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
body{
    background-color: #1e1e2f;
    color: white;
    font-family: Arial, sans-serif;
}

/* Center container */
.form-wrapper{
    display: flex;
    justify-content: center;
    align-items: center;
    height: 80vh;
}

/* Form card */
form{
    background-color: #2c2c3e;
    padding: 30px;
    border-radius: 12px;
    width: 320px;
    box-shadow: 0 8px 20px rgba(0,0,0,0.5);
    display: flex;
    flex-direction: column;
    gap: 15px;
}

/* Title */
h1{
    text-align: center;
    margin-bottom: 20px;
}

/* Labels */
label{
    font-size: 14px;
}

/* Inputs */
input{
    padding: 10px;
    border-radius: 6px;
    border: none;
    outline: none;
}

/* Focus effect */
input:focus{
    box-shadow: 0 0 5px #4CAF50;
}

/* Submit button */
input[type="submit"]{
    background-color: #4CAF50;
    color: white;
    font-weight: bold;
    cursor: pointer;
    transition: 0.3s;
}

input[type="submit"]:hover{
    background-color: #45a049;
}
</style>
</head>

<body>

<%@ include file="Navbar.jsp" %>

<div class="form-wrapper">
    <form action="register" method="post">
        <h1>Register</h1>

        <label>Username</label>
        <input type="text" name="uname" placeholder="Enter username">

        <label>City</label>
        <input type="text" name="city" placeholder="Enter city">

        <label>Email</label>
        <input type="email" name="email" placeholder="Enter email">

        <label>Password</label>
        <input type="password" name="pass" placeholder="Enter password">

        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>