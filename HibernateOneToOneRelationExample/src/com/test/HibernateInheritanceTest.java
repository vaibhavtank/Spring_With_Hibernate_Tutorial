package com.test;


import com.dao.EmployeDetailsDao;
import com.dao.EmployeeDetailsDaoi;
import com.model.Employee;
import com.model.PersonalDetails;


public class HibernateInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    PersonalDetails details1 = new PersonalDetails();
    details1.setFirstname("Devang");
    details1.setLastname("Chauhan");
    
    EmployeeDetailsDaoi dao = new EmployeDetailsDao();
    dao.createPersonalDetails(details1);
    
    Employee employee1 = new Employee();
    employee1.setUserName("Devang Chauhan");
    employee1.setPersonalDetails(details1);
    
    dao.creaeteEmployeeDetails(employee1);
		
		
		
	}

}
