package com.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class HelloSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xb = new XmlBeanDefinitionReader(beans);
		xb.loadBeanDefinitions("beans.xml");
		
		
		HelloSpring h1 = (HelloSpring)beans.getBean("hello1");
		h1.printMessage();
		
		HelloSpring h2 = (HelloSpring)beans.getBean("hello2");
		h2.printMessage();
		
		HelloSpring h3 = (HelloSpring)beans.getBean("hello3");
		h3.printMessage();
		h3.printList();
		
		HelloSpring h4 = (HelloSpring)beans.getBean("hello4");
		h4.printMessage();
		h4.printList();
		h4.printSet();
		
		HelloSpring h5 = (HelloSpring)beans.getBean("hello5");
		h5.printMessage();
		h5.printList();
		h5.printSet();
		h5.printMap();
		
		HelloSpring h6 = (HelloSpring)beans.getBean("hello6");
		h6.printMessage();
		h6.printList();
		h6.printSet();
		h6.printMap();
		
		
	}

}
