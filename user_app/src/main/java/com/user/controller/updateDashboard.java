package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;
import com.user.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class updateDashboard extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int uid = Integer.parseInt(req.getParameter("userId"));
		String name = req.getParameter("username");
		String city = req.getParameter("city");
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		
		User user = new User();
		user.setUserId(uid);
		user.setUsername(name);
		user.setCity(city);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDao udao = new UserDaoImpl();
		boolean result = udao.updateUser(user);
		
		if(result) {
			System.out.println("User Successfully Updated! :)");
			res.sendRedirect("view_all_users");
		}
		else {
			PrintWriter out = res.getWriter();
			out.println("Failed to Update the User :( Sorry you can't update USER ID");
			System.out.println("Failed to Update the User :(");
		}
	}
}
