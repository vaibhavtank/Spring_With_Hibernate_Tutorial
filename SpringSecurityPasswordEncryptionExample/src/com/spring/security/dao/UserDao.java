package com.spring.security.dao;

import java.util.List;

import com.spring.security.model.User;

public interface UserDao {
 
    void save(User user);
     
    User findById(int id);
     
    User findBySSO(String sso);
    
    List<User> findAllUser();
    
    void updateUser(User user);
    
    void deleteUser(User user );
     
}