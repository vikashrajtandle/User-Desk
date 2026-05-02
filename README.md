# 🚀 UserDesk – User Management System

**UserDesk** is a Java-based web application that provides a complete **User Management System** with authentication and CRUD operations. It allows users to register, log in, and manage user records through an interactive dashboard.

---

## 📌 Features

* 🔐 **User Authentication**

  * User Registration
  * Secure Login
  * Session Management

* 📊 **Dashboard**

  * View all registered users
  * Centralized control panel

* ⚙️ **CRUD Operations**

  * ➕ Add new user
  * ✏️ Edit user details
  * ❌ Delete user
  * 🔍 Get user by ID

---

## 🛠️ Tech Stack

* **Backend:** Java (Servlets, JSP)
* **Frontend:** HTML, CSS
* **Database:** MySQL
* **Architecture:** DAO Pattern
* **Server:** Apache Tomcat

---

## 🧱 Project Structure

```
UserDesk/
│
├── src/main/java/
│   ├── controller/        # Servlets (Login, Register, Edit, Delete, etc.)
│   ├── dao/               # Data Access Objects
│   ├── daoimpl/           # DAO Implementations
│   ├── model/             # Java Beans (User class)
│
├── src/main/webapp/
│   ├── jsp/               # JSP Pages (login, register, dashboard, edit)
│   ├── css/               # Stylesheets
│   ├── index.jsp
│
├── pom.xml                # Maven Configuration
```

---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites

* Java JDK 8 or above
* Apache Tomcat Server
* MySQL Server
* Eclipse / IntelliJ (with Maven support)

---

### 2️⃣ Database Setup

```sql
CREATE DATABASE userdesk;

USE userdesk;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);
```

---

### 3️⃣ Configure Database Connection

Update your DB credentials in DAO implementation file:

```java
String url = "jdbc:mysql://localhost:3306/userdesk";
String username = "root";
String password = "your_password";
```

---

### 4️⃣ Run the Project

1. Import project as **Maven Project**
2. Configure **Tomcat Server**
3. Deploy the project
4. Open in browser:

```
http://localhost:8080/UserDesk/
```

---

## 🔄 Application Flow

1. User registers or logs in
2. Session is created
3. Dashboard displays all users
4. User can perform CRUD operations
5. Logout destroys session

---

## 🧠 Concepts Used

* Servlet Lifecycle
* Session Tracking (`HttpSession`)
* MVC Architecture
* DAO Design Pattern
* JDBC Connectivity
* JSP for dynamic UI

---

## 🚧 Future Enhancements

* 🔒 Password encryption (BCrypt)
* 👥 Role-based access (Admin/User)
* 🔍 Search & filter users
* 📱 Responsive UI (Bootstrap)
* 🌐 REST API integration
