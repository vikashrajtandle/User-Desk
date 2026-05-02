package com.user.dao;

import java.util.List;

import com.user.dto.User;



public interface UserDao {
	
	boolean userRegister(User user);
	List<User> getAllUsers();
	boolean userDeletionById(int userId);
	User getUserById(int userId);
	boolean updateUser(User user);
	User logIn(String email, String password);
	
	
}
