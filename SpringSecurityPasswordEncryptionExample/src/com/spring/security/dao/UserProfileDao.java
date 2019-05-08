package com.spring.security.dao;

import java.util.List;

import com.spring.security.model.UserProfile;
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}