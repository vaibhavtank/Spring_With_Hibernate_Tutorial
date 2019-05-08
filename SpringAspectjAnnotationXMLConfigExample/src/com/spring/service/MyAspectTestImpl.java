package com.spring.service;

import org.springframework.stereotype.Component;




@Component("mytest")
public class MyAspectTestImpl implements MyAspectTest {

	public MyAspectTestImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Am in m1()");
	}

}
