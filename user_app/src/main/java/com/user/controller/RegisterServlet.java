package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;
import com.user.dto.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String city = req.getParameter("city");
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		
		//Transferring data from form to DTO
		User user = new User();
		user.setUsername(name);
		user.setCity(city);
		user.setEmail(email);
		user.setPassword(password);
		
		//registering the created user object to Database via DAO
		UserDao usDao = new UserDaoImpl();
		boolean isRegistered = usDao.userRegister(user);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		if(isRegistered) {
			System.out.println("User Registered Successfully");
			out.println("Registerd Successfully");
//			RequestDispatcher rd = req.getRequestDispatcher("Dashboard.jsp");
//			rd.forward(req, res);
			res.sendRedirect("view_all_users");
		}
		else {
			System.out.println("FAILED to register User");
		}
	}
}
