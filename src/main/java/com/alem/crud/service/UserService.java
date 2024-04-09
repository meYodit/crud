package com.alem.crud.service;

import com.alem.crud.model.LoginRequest;
import com.alem.crud.model.User;

public interface UserService {
	public void insertUser(User u);
	public User login(LoginRequest loginRequest);
}
