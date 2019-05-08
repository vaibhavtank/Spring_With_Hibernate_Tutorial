package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.HourlyEmployee;
import com.model.SalariedEmployee;
import com.util.HibernateUtil;

public class EmployeDetailsDao implements EmployeeDetailsDaoi {

	Session session = null;
	Transaction tx = null;
	
	@Override
	public void createHourlyEmployeeDetails(HourlyEmployee employee) {
		// TODO Auto-generated method stub
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
			System.out.println("Hourly Employee Created");
			
			
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
	public void createSalariedEmployeeDetails(SalariedEmployee employee) {
		// TODO Auto-generated method stub
		
		
try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
			System.out.println("Salaried Employee Created");
			
			
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
