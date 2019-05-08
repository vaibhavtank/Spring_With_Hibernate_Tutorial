package com.dao;

import com.model.Employee;
import com.model.PersonalDetails;



public interface EmployeeDetailsDaoi {
	
public void createPersonalDetails(PersonalDetails pdetails);
public void creaeteEmployeeDetails(Employee employee);
public PersonalDetails getPersonalDetails();

}
