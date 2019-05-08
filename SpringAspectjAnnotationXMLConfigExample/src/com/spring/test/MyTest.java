package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.MyAspectTest;
import com.spring.service.MyAspectTestImpl;

public class MyTest {

	public MyTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		MyAspectTestImpl test = (MyAspectTestImpl)context.getBean("mytest");
        test.m1();
		

	}

}
