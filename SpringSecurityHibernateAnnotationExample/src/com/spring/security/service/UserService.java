package com.spring.security.service;

import com.spring.security.model.User;

public interface UserService {
	 
    User findById(int id);
     
    User findBySso(String sso);
     
}