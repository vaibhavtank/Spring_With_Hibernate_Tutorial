package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.PersonalDetails;



public interface PersonalDetailsDAOi {
   
	public void createPersonalDetails(PersonalDetails details);
	public List<PersonalDetails> showPersonalDetails();
}
