package com.spring.security.service;

import java.util.List;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

import com.spring.security.model.User;

public interface UserService {
 
    void save(User user);
    
 
    User findById(int id);
     
    User findBySso(String sso);
    
    List<User> findAllUser();
    
    @PreAuthorize("hasRole('ADMIN')")
    void updateUser(User user);
    
    @PreAuthorize("hasRole('ADMIN') AND hasRole('DBA')")
    void deleteUser(int id);
     
}