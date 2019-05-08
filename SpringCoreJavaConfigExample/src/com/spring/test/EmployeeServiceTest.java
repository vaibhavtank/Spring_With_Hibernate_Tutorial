package com.spring.test;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.configure.AppConfig;
import com.spring.dao.EmployeeDAOImpl;
import com.spring.datasource.DataSourceImple;
import com.spring.service.EmployeeService;
import com.spring.service.EmployeeServiceImpl;

public class EmployeeServiceTest implements ApplicationContextAware{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	ApplicationContext beans = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//Get Employee Service
		EmployeeService service = (EmployeeService)beans.getBean("employeeServices");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Emo]ployee No :");
		int empno = sc.nextInt();
		System.out.println("Pleae Enter Increment Amount:");
		double amount = sc.nextDouble();
		
		service.incrementSalary(empno, amount); */
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeService");
		
		service.incrementSalary(1, 3000);
		

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}


}
