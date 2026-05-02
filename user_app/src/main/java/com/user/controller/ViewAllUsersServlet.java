package com.user.controller;

import java.io.IOException;
import java.util.List;

import com.user.dao.UserDaoImpl;
import com.user.dto.User;
import com.user.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view_all_users")
public class ViewAllUsersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession session =req.getSession(false);
		
		if(session!=null && session.getAttribute("user_data")!=null) {
			
			UserDao udao = new UserDaoImpl();
			
			List<User> uslist = udao.getAllUsers();
			
			if(!uslist.isEmpty()) {
				req.setAttribute("users", uslist);
				req.getRequestDispatcher("Dashboard.jsp").forward(req, res);
			}
			
		}
		else {
			res.sendRedirect("Login.jsp");
		}
		
	}
}
