package com.user.controller;

import java.io.IOException;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;
import com.user.dto.User;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class editUser extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int uid = Integer.parseInt(req.getParameter("uid"));
		UserDao udao = new UserDaoImpl();
		
		User us = udao.getUserById(uid);
		
		ServletContext application = getServletContext();
		application.setAttribute("user", us);
		req.getRequestDispatcher("Edit.jsp")
		.forward(req, res);
		
	}
}
