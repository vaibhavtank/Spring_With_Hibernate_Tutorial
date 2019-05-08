package com.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class HelloSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xb = new XmlBeanDefinitionReader(beans);
		xb.loadBeanDefinitions("beans.xml");
		
		HelloSpring hello =(HelloSpring)beans.getBean("hello1");
		hello.printValue();
		
		
	}

}
