package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface IUserService {
	List<User> getAllUsers();
	User getUserDetails(int id);
	User addNewUser(User u);
	void deleteUser(int uid);
	User updateUserDetails(User u);
	User login(String email,String password);
}
