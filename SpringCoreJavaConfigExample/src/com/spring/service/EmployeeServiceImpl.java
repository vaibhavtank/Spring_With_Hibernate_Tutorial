package com.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDAO;
import com.spring.dao.EmployeeDAOImpl;

@Component
@Scope("singleton")
public class EmployeeServiceImpl implements EmployeeService,InitializingBean  {
	
@Autowired
@Qualifier("employeeDAO")
private EmployeeDAO employeeDAO;
	
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
