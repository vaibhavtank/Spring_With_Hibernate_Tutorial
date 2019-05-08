package com.spring.service;

import org.springframework.beans.factory.InitializingBean;

import com.spring.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService, InitializingBean {

	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public boolean incrementSalary(int empno, double amt) {
		// TODO Auto-generated method stub
		
		double sal = employeeDAO.getSal(empno);
		sal+=amt;
		employeeDAO.setSal(empno, sal);
		System.out.println(sal);
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service Bean initialization completed");
	}

}
