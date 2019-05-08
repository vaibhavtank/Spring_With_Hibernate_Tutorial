package com.spring.security.service;

import java.util.List;

import com.spring.security.model.UserProfile;
 
public interface UserProfileService {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}