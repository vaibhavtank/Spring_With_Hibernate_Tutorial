package com.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("MyAspects")
@Aspect
public class MyAspects {

	public MyAspects() {
		// TODO Auto-generated constructor stub
	}
	
	@Pointcut("execution (* com.spring.service.*.*(..))")
	public void selectAll(){}
	
	@Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("Going to setup m1() method.");
	   }
	
	@AfterReturning("selectAll()")
	 public void afterAdvice(){
	      System.out.println("Execute after m1() method.");
	   }

	@Around("selectAll()")
	 public void aroudAdvice(){
	      System.out.println("Aroud advice for m1() method.");
	   }


}
