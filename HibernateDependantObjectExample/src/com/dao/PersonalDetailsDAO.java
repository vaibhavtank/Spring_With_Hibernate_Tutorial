package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.model.PersonalDetails;

public class PersonalDetailsDAO implements PersonalDetailsDAOi {

	ServiceRegistry serviceRegistrty;
	SessionFactory sessionFactory;
	Session session;
	Transaction tx = null;
	List<PersonalDetails> list = null;
	@Override
	public void createPersonalDetails(PersonalDetails details) {
		// TODO Auto-generated method stub
		
		try{
		
			Configuration configuraion = new Configuration();
			configuraion.configure();
			serviceRegistrty = new ServiceRegistryBuilder().applySettings(
			configuraion.getProperties()). buildServiceRegistry();
			sessionFactory = configuraion.buildSessionFactory(serviceRegistrty);
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(details);
			tx.commit();
			System.out.println("Details Added");
			
		}catch(Exception e){
			System.out.println("Exception Generated in PersonalDetails Creation");
			tx.rollback();
		}finally{
			session.close();
		}
	    
		
	}

	@Override
	public List<PersonalDetails> showPersonalDetails() {
		// TODO Auto-generated method stub
		
		try{
			
			Configuration configuraion = new Configuration();
			configuraion.configure();
			serviceRegistrty = new ServiceRegistryBuilder().applySettings(
			configuraion.getProperties()). buildServiceRegistry();
			sessionFactory = configuraion.buildSessionFactory(serviceRegistrty);
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			list = session.createQuery("from PersonalDetails").list();
			tx.commit();
			System.out.println("Details Fetched");
			return list;
			
		}catch(Exception e){
			System.out.println("Exception Generated in PersonalDetails Creation");
			tx.rollback();
			return null;
		}finally{
			session.close();
		}
	    
		
		
	}

}
