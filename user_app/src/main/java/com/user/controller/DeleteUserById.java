package com.user.controller;



import java.io.IOException;

import com.user.dao.UserDao;
import com.user.dao.UserDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class DeleteUserById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("uid"));
		UserDao dao = new UserDaoImpl();
		
		boolean result = dao.userDeletionById(id);
		
		if(result) {
			try {
				res.sendRedirect("view_all_users");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
