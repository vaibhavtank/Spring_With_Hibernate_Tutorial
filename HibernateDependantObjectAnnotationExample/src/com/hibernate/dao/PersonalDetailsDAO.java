package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate.model.PersonalDetails;
import com.hibernate.util.HibernateUtil;

public class PersonalDetailsDAO implements PersonalDetailsDAOi {

	ServiceRegistry serviceRegistrty;
	SessionFactory sessionFactory;
	Session session;
	Transaction tx = null;
	List<PersonalDetails> list = null;


	@Override
	public List<PersonalDetails> showPersonalDetails() {
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			list = session.createQuery("from PersonalDetails").list();
			tx.commit();
			System.out.println("Details Fetched");
			return list;
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception Generated in PersonalDetails Creation");
			tx.rollback();
			return null;
		}finally{
			session.close();
		}
	    
	}

	@Override
	public void createPersonalDetails(PersonalDetails details) {
		// TODO Auto-generated method stub
		
		try{
			
			session =  HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(details);
			tx.commit();
			System.out.println("Details Added");
			
		}catch(Exception e){
			System.out.println("Exception Generated in PehirsonalDetails Creation");
			tx.rollback();
		}finally{
			//session.close();
		}
		
	}

}
