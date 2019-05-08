package com.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDAO;

@Service("employeeServices")
public class EmployeeServiceImpl implements EmployeeService,InitializingBean  {

@Autowired
@Qualifier("empdao-oracle")
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
