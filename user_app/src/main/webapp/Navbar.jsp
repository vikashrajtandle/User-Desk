<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>nav-bar</title>
<style>
*{
    margin:0;
    padding:0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

.container{
    height: 70px;
    background: linear-gradient(90deg, #13005A, #3F0071);
    color: white;
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 0 40px;
    box-shadow: 0 4px 10px rgba(0,0,0,0.3);
}

/* Logo */
.logo{
    font-size: 22px;
    font-weight: bold;
    letter-spacing: 1px;
}

/* Nav list */
ul{
    list-style: none;
    display: flex;
    gap: 25px;
}

/* Links */
ul li a{
    text-decoration: none;
    color: white;
    font-size: 16px;
    padding: 8px 12px;
    border-radius: 5px;
    transition: 0.3s;
}

/* Hover effect */
ul li a:hover{
    background-color: rgba(255,255,255,0.2);
}

/* Active / highlight button (optional) */
.logout{
    background-color: #ff4d4d;
}

.logout:hover{
    background-color: #e60000;
}

.app_name{
	display: inline-block;
	font-family: cursive;
	font-size: 30px;
}
</style>
</head>
<body>
<div class="container">
    <div class="logo"><img src="https://png.pngtree.com/png-vector/20231213/ourmid/pngtree-user-icon-in-hand-drawn-style-vector-png-image_11259911.png" height="30px" width="30px"><h1 class="app_name">User Desk</h1></div>

    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="view_all_users">Dashboard</a></li>
        <li><a href="RegistrationForm.jsp">Register</a></li>
        <li><a href="Login.jsp">Login</a></li>
        <li><a class="logout" href="Logout">Logout</a></li>
    </ul>
</div>
</body>
</html>