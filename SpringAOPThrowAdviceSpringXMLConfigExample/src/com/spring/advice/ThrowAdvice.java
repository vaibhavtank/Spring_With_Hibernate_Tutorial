package com.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception e){
		System.out.println("All Exceptions handled here");
	}
	
	public void afterThrowing(Method m,Object args[],Object target,Exception e)
	   {
	       System.out.println("Execption is thrown by"+ m.getName());
	       System.out.println(args);
	   }
	
	public void afterThrowing(ArithmeticException e)
	   {
	       System.out.println("Arithmetic Exception is Thrown");
	       e.printStackTrace();
	   }
}
