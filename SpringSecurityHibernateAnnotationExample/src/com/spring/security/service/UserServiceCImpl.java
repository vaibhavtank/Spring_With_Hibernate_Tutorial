package com.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.dao.UserDaoImpl;
import com.spring.security.model.User;

@Service("userService")
@Transactional

class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDaoImpl dao;
 
    public User findById(int id) {
        return dao.findById(id);
    }
 
    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
}