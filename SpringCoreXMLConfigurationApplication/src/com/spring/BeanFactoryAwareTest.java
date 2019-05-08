package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFactoryAwareTest implements BeanFactoryAware {

	BeanFactory factory;
	
	@Override
	public void setBeanFactory(BeanFactory f) throws BeansException {
		// TODO Auto-generated method stub
		factory = f;
	}

	public BeanFactory getFactory() {
		return factory;
	}
	
	

}
