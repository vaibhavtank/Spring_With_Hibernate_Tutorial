package com.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("beforeAdvice")
public class BeforeMethodAdviceExample implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] arg1, Object traget) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before"+m.getName() + " this advice  call"  );
	}
	

}
