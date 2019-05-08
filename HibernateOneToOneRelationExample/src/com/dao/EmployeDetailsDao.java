package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.PersonalDetails;
import com.util.HibernateUtil;

public class EmployeDetailsDao implements EmployeeDetailsDaoi {

	Session session = null;
	Transaction tx = null;
	@Override
	public void createPersonalDetails(PersonalDetails pdetails) {
		// TODO Auto-generated method stub
		
try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(pdetails);
			tx.commit();
			System.out.println("Personal Created");
			
			
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}finally{
			session.close();
		}
		
		
		
	}
	@Override
	public void creaeteEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
	try{	
	
		session = HibernateUtil.getSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		System.out.println("Employee Details Created");
		
		
	}catch(Exception e){
		e.printStackTrace();
		if(tx!=null){
			tx.rollback();
		}
	}finally{
		session.close();
	}
	
	
		
	}
	
	

}
