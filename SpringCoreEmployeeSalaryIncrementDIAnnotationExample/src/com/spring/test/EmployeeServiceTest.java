package com.spring.test;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.EmployeeService;

public class EmployeeServiceTest implements ApplicationContextAware{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//Get Employee Service
		EmployeeService service = (EmployeeService)beans.getBean("employeeServices");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Emo]ployee No :");
		int empno = sc.nextInt();
		System.out.println("Pleae Enter Increment Amount:");
		double amount = sc.nextDouble();
		
		service.incrementSalary(empno, amount);
		

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}


}
