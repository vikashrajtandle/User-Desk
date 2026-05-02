package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.user.dto.User;
import com.user.util.DBcon;

public class UserDaoImpl implements UserDao{
	
	Connection con = DBcon.getConnection();
	@Override
	public boolean userRegister(User user) {
		String addUser = "INSERT INTO user(user_name,city,email,password) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(addUser);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2,user.getCity());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public List<User> getAllUsers() {
		String showUsers = "SELECT * FROM user";
		List<User> ulist = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(showUsers);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				User us = new User();
				us.setUserId(rs.getInt(1));
				us.setUsername(rs.getString(2));
				us.setCity(rs.getString(3));
				us.setEmail(rs.getString(4));
				
				ulist.add(us);
			}
			return ulist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean userDeletionById(int userId) {
		String delete = "DELETE FROM USER WHERE user_id=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(delete);
			
			pstmt.setInt(1, userId);
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public User getUserById(int userId) {
		String query = "SELECT * FROM user WHERE user_id=?";

		
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			ResultSet rs =pstmt.executeQuery();
			
			if(rs.next()) {
				User u = new User();
				u.setUserId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setCity(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public boolean updateUser(User user) {
		String up = "UPDATE user SET user_id= ?,user_name=?,city=?,email=?,password=? WHERE user_id=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(up);
			
			pstmt.setInt(1, user.getUserId());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getCity());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPassword());
			pstmt.setInt(6, user.getUserId());
			
			int c = pstmt.executeUpdate();
			if(c>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public User logIn(String email, String password) {
		String qry = "SELECT * FROM user WHERE email=? AND password=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				User u = new User();
				
				u.setUserId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setCity(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				
				return u;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
