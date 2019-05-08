package com.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	private static Session session;
	
	public static Session getSession(){
 
	try{
		  Properties  prop = new Properties();
	        prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	        prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
			prop.setProperty("hibernate.connection.username", "root");
			prop.setProperty("hibernate.connection.password", "");
			prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			prop.setProperty("hibernate.hbm2ddl.auto","update");
			prop.setProperty("hibernate.show_sql","true");
			prop.setProperty("hibernate.format_sql","true");
			
			
			Configuration configuration = new Configuration();
			configuration.addPackage("com.hibernate.model")
			.addProperties(prop);
			
		    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()). buildServiceRegistry();
			sessionFactory  = configuration.buildSessionFactory(serviceRegistry);
			session = sessionFactory.openSession();	
			return session;
	}catch(Throwable ex){
		throw new ExceptionInInitializerError(ex);
	}
        
		
	}

}
