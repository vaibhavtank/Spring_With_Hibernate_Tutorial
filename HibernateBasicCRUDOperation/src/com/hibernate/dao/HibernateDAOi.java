package com.hibernate.dao;

import com.hibernate.model.Employee;

public interface HibernateDAOi {
	
	public void createEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(int empno);
	public void removeEmployee(Employee emp);
	

}
