package com.user.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		//.getSession() It will return the existing session if session already exist ELSE it will create new session object.
		//.getSession(true) It is same as .getSession().
		//.getSession(false) It will return existing session, else it returns null.
		
		session.invalidate();
		res.sendRedirect("Login.jsp");
	}
}
