package com.user.controller;

import java.io.IOException;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;
import com.user.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class logInServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		UserDao udao = new UserDaoImpl();
		
		User use = udao.logIn(email, pass);
		
		HttpSession session = req.getSession();
		if(use!=null) {
			session.setAttribute("user_data", use); //Session ID created
			res.sendRedirect("view_all_users");
		}
		else {
			req.setAttribute("error", "Invalid Email or Password");
			req.getRequestDispatcher("Login.jsp")
			.forward(req, res);
		}
	}
}
