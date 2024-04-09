package com.alem.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alem.crud.model.LoginRequest;
import com.alem.crud.model.User;
import com.alem.crud.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository ur;
	
	public void insertUser(User u) {
		// TODO Auto-generated method stub
		ur.save(u);
	}

	public User login(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
//		Integer userId = ur.validateUser(loginRequest.getEmail(), loginRequest.getPassword());
//
//		if (userId == null) {
//		    userId = 0;
//		} 
		
//		return userId;
		return ur.validateUser(loginRequest.getEmail(), loginRequest.getPassword());

	}

	
}
