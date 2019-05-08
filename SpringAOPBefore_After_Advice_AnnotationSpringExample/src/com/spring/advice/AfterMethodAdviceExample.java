package com.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("afterAdvisor")
public class AfterMethodAdviceExample implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object return_value, Method m, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("After"+ m.getName()+" this advice executed");
		
		
	}

}
