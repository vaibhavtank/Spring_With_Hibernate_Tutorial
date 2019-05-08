package com.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.Employee;
import com.util.HibernateUtil;

public class HibernateDAO implements HibernateDAOi {

	Session session = null;
	Transaction tx = null;
	
	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try{
		session = HibernateUtil.getSession();
		tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		System.out.println("Employee Created");
		}catch(Exception e){
			System.out.println("Exception in creating in Employee");
			tx.rollback();
		}finally{
			session.disconnect();
		}
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		try{
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
			}catch(Exception e){
				System.out.println("Exception in update in Employee");
				tx.rollback();
			}finally{
				session.close();
			}
	
	}

	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		
		try{
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			Employee emp = (Employee) session.load(Employee.class,new Integer(empno));
			System.out.println(emp);
			tx.commit();
			return emp;
			}catch(Exception e){
				System.out.println("Exception in Get in Employee");
				tx.rollback();
				return null;
			}finally{
				session.close();
			}
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		try{
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.delete(emp);
			tx.commit();
			}catch(Exception e){
				System.out.println("Exception in delete in Employee");
				tx.rollback();
			}finally{
				session.close();
			}
		
	}

}
