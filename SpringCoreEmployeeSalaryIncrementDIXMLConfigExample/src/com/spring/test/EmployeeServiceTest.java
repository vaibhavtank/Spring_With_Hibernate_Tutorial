package com.spring.test;

import java.beans.Beans;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.service.EmployeeService;

public class EmployeeServiceTest implements BeanFactoryAware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory beans= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xb = new XmlBeanDefinitionReader(beans);
		xb.loadBeanDefinitions("beans.xml");  
		
		//Get Employee Service
		EmployeeService service = (EmployeeService)beans.getBean("employeeService");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Emo]ployee No :");
		int empno = sc.nextInt();
		System.out.println("Pleae Enter Increment Amount:");
		double amount = sc.nextDouble();
		
		service.incrementSalary(empno, amount);
		

	}

	@Override
	public void setBeanFactory(BeanFactory b) throws BeansException {
		// TODO Auto-generated method stub
	}

}
