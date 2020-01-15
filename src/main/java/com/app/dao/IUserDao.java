package com.app.dao;

import com.app.pojos.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserDao extends JpaRepository<User, Integer> {

	User findByEmailAndPassword(String email,String password);
	
	//@Query("select u from user u")
	//List<User> findAllUser();
	
	
}
