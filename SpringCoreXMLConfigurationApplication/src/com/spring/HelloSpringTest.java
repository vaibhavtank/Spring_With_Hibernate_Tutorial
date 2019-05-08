package com.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class HelloSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xb = new XmlBeanDefinitionReader(beans);
		xb.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		
		HelloSpring hello1 = (HelloSpring)beans.getBean("hello1");
		hello1.geMessage();
		
		HelloSpring hello2 = (HelloSpring)beans.getBean("hello2");
		hello2.geMessage();
		
		HelloSpring hello3 = (HelloSpring)beans.getBean("hello3");
		hello3.geMessage();
		
		HelloSpring hello4 = (HelloSpring)beans.getBean("hello4");
		hello4.geMessage();
		
		Person p1 = (Person)beans.getBean("person3");
		p1.getValue();
		

	}

}
