package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao dao;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserDetails(int id) {
		return dao.findById(id).get();
	}

	@Override
	public User addNewUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub

	}

	@Override
	public User updateUserDetails(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String email, String password) {
		return dao.findByEmailAndPassword(email, password);
	}
}
