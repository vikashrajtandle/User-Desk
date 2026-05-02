<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User_app</title>
</head>
<style>
/* Centering styles for the initial welcome container */
.ind-container{
    display: flex;
    align-items: center;
    justify-content: center;
    margin-top: 50px; /* Optional spacing */
}

/* Base styles for the dark theme */
body{
    color: white;
    background-color: #1e1e2f;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

/* Container to arrange cards in a clean, responsive grid */
.cards-container {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
    gap: 30px;
    padding: 40px;
    justify-items: center;
    max-width: 1200px;
    margin: 0 auto;
}

/* Styling for each individual card */
.user-card {
    background-color: #512B81;
    color: white;
    border-radius: 12px;
    padding: 25px;
    text-align: center;
    transition: transform 0.2s ease-in-out, box-shadow 0.2s ease-in-out;
    cursor: pointer;
    width: 100%;
    box-shadow: 0 4px 8px rgba(0,0,0,0.3);
}

/* Simple hover effects for showcase */
.user-card:hover {
    transform: translateY(-5px);
    box-shadow: 0 8px 16px rgba(0,0,0,0.5);
}

/* Card images/icons style */
.user-card .card-icon {
    font-size: 4em;
    margin-bottom: 15px;
    display: block;
}

/* For actual image implementation, use this class: */
/*
.user-card img {
    max-width: 100px;
    margin-bottom: 15px;
    display: block;
    margin-left: auto;
    margin-right: auto;
}
*/

.user-card h3 {
    margin: 10px 0;
    font-size: 1.5em;
}

.user-card p {
    font-size: 1em;
    opacity: 0.9;
    line-height: 1.4;
}

.welcome{
	margin: 40px;
	font-family: emoji;
}
</style>
<body>
    <%@ include file="Navbar.jsp" %>
    
    <div class="ind-container">
        <!-- Text corrected from 'WECLOME' to 'WELCOME' -->
        <h1 class="welcome">WELCOME</h1>
    </div>

    <!-- Container for the four showcase cards -->
    <div class="cards-container">
        
        <!-- Card 1: View All Users -->
        <div class="user-card">
            <span class="card-icon">&#128101;</span> <!-- People icon -->
            <h3>View All Users</h3>
            <p>Browse the complete database of users.</p>
        </div>

        <!-- Card 2: Delete Users -->
        <div class="user-card">
            <span class="card-icon">&#128465;</span> <!-- Trash icon -->
            <h3>Delete Users</h3>
            <p>Remove user accounts securely and permanently.</p>
        </div>

        <!-- Card 3: Edit Users -->
        <div class="user-card">
            <span class="card-icon">&#9998;</span> <!-- Pencil icon -->
            <h3>Edit Users</h3>
            <p>Modify user details, permissions, and roles.</p>
        </div>

        <!-- Card 4: Search Users -->
        <div class="user-card">
            <span class="card-icon">&#128269;</span> <!-- Search icon -->
            <h3>Search Users</h3>
            <p>Find specific users by name, email, or other criteria.</p>
        </div>

    </div>
</body>
</html>