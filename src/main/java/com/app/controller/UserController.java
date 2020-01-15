package com.app.controller;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.User;
import com.app.service.IUserService;



@RestController // =@Copntroller+@ResponseBody
//on all ret types of req handling methods.
@RequestMapping("/user")
@CrossOrigin // origins=*

public class UserController {
	@Autowired
	private IUserService service;

	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}

	@GetMapping("/login/{uname}/{password}")
	public ResponseEntity<?> loginUser(@PathVariable String uname,@PathVariable String password) {
		System.out.println("in login method");
		System.out.println("unmae"+uname);
		System.out.println("pass"+password);
		// invoke service layer method to get emp list
		User u = service.login(uname, password);
		if (u == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}

}
