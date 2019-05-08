package com.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.exceptions.MyException;
import com.spring.services.AccountServices;

public class SpringAOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xb = new XmlBeanDefinitionReader(beans);
		xb.loadBeanDefinitions("beans.xml");
		
		AccountServices as = (AccountServices) beans.getBean("id4");
		try {
			as.deposit(1, 1000);
			as.withdrow(1, 200);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
