package com.alem.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alem.crud.model.LoginRequest;
import com.alem.crud.model.User;
import com.alem.crud.service.UserServiceImpl;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	UserServiceImpl us;
	
	// POSTMAN
	// METHOD = POST
	// URL = http://localhost:8080/registerUser
	// HEADERS - key : Content-Type, value : application/json
	// BODY : raw-type : {"firstname": "sugone","lastname": "gone","password": "1200abc","email": "s@gmail.com","phone": 1234567,"address": "NYC","securityQuestions": [{"question1": "1","answer1": "rtyu"},{"question2": "2","answer2": "fghjk"}]}
	
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		us.insertUser(user);
	}
	
	// POSTMAN
	// METHOD = POST
	// URL = http://localhost:8080/login
	// key:email value: x@g.com, key:password: value:sdfgjk
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public User Login(@RequestBody LoginRequest loginRequest) {
		User user = us.login(loginRequest);
		System.out.println(user);
		return user;
	}
	
	
}
