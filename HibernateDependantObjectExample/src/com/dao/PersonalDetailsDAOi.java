package com.dao;

import java.util.List;

import com.model.PersonalDetails;

public interface PersonalDetailsDAOi {
   
	public void createPersonalDetails(PersonalDetails details);
	public List<PersonalDetails> showPersonalDetails();
}
