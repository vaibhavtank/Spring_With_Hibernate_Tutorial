package com.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.dao.EmployeeDAOImpl;
import com.spring.datasource.DataSourceImple;
import com.spring.service.EmployeeServiceImpl;


@Configuration
@Import(DataSourceImple.class)
@ComponentScan(basePackages="com.spring.*")
public class AppConfig {

		
	
	@Bean(name="employeeService")
	public EmployeeServiceImpl employeeService(){
         
		return new EmployeeServiceImpl();
	}

	@Bean(name="employeeDAO")
	public EmployeeDAOImpl employeeDAO() {
		// TODO Auto-generated method stub
		return new EmployeeDAOImpl();
	}

	@Bean(name="ds")
	public DataSourceImple DataSourceImple() {
		// TODO Auto-generated method stub
		return new DataSourceImple();
	}
	
	

	
}
