<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
body{
    background-color: #1e1e2f;
    color: white;
    font-family: Arial, sans-serif;
    margin: 0;
}

/* Center form */
.wrapper{
    display: flex;
    justify-content: center;
    align-items: center;
    height: 85vh;
}

/* Card */
.form-box{
    background-color: #2c2c3e;
    padding: 30px;
    border-radius: 12px;
    width: 320px;
    box-shadow: 0 8px 20px rgba(0,0,0,0.5);
}

/* Title */
h1{
    text-align: center;
    margin-bottom: 15px;
}

/* Error */
.error{
    color: #ff4d4d;
    text-align: center;
    margin-bottom: 10px;
}

/* Inputs */
input{
    width: 100%;
    padding: 10px;
    margin-top: 8px;
    margin-bottom: 15px;
    border-radius: 6px;
    border: none;
}

input:focus{
    outline: none;
    box-shadow: 0 0 5px #4CAF50;
}

/* Button */
button{
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    border: none;
    color: white;
    border-radius: 6px;
    cursor: pointer;
    transition: 0.3s;
}

button:hover{
    background-color: #45a049;
}
</style>

</head>
<body>

<%@ include file="Navbar.jsp" %>

<div class="wrapper">
    <div class="form-box">
        <h1>Login</h1>


            <div class="error">${error}</div>

        <form action="login" method="post">
            <label>Email</label>
            <input type="email" name="email" required>

            <label>Password</label>
            <input type="password" name="password" required>

            <button type="submit">Log In</button>
        </form>
    </div>
</div>

</body>
</html>