package com.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import com.spring.security.dao.UserDao;
import com.spring.security.model.User;
 
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao dao;
     
    @Autowired
    private PasswordEncoder passwordEncoder;
 
    static List<User> users = new ArrayList<User>();
    
    
    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        dao.save(user);
    }
     
    public User findById(int id) {
        return dao.findById(id);
    }
 
    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return dao.findAllUser();
	}

	@Override
	public void updateUser(User user) {
		
		    System.out.println("Only an Admin can Update a User");
	        User u = findById(user.getId());
	        u.setFirstName(user.getFirstName());
	        u.setLastName(user.getLastName());
	        u.setEmail(user.getEmail());
	        u.setId(user.getId());
	        u.setPassword(user.getPassword());
	        u.setSsoId(user.getSsoId());
	        u.setState(user.getState());
	        u.setUserProfiles(user.getUserProfiles());
	        dao.updateUser(u);
		 
	}

	@Override
	public void deleteUser(int id) {
		    User u = findById(id);
	        dao.deleteUser(u);
	    }
		
	}
	

   
