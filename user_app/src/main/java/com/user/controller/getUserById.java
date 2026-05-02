package com.user.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;
import com.user.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getUserById")
public class getUserById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserDao us = new UserDaoImpl();
		
		int id = Integer.parseInt(req.getParameter("uid"));
		
		User oneUser = us.getUserById(id);
		List<User> list = new ArrayList<>();
		list.add(oneUser);
		
		if(!list.isEmpty()) {			
			req.setAttribute("users", list);
			req.getRequestDispatcher("Dashboard.jsp").forward(req, res);
		}
		
	}
}
