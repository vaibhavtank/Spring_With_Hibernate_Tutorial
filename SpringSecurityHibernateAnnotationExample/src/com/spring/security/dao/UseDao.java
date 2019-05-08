package com.spring.security.dao;

import com.spring.security.model.User;

 interface UserDao {
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
}
