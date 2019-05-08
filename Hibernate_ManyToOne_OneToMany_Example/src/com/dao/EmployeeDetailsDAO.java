package com.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeDetailsDAO implements EmployeeDetailsi{

	Session session = null;
	Transaction tx = null;
	
	@Override
	public void addDepartmentDetails(Department dept) {
		// TODO Auto-generated method stub
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(dept);
			tx.commit();
			System.out.println("Department Created");
						
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			System.out.println("Problem Generating Department");
		}
		}finally{
			session.close();
		}		
	}

	@Override
	public void addEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(emp);
			tx.commit();
			System.out.println("Employee Details Generated");
						
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			System.out.println("Problem Generating Employee Details");
		}
		}finally{
			session.close();
		}
		
	}

	@Override
	public Employee getEmployeeDetails(int empNo) {
		// TODO Auto-generated method stub
		Employee emp = null;
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			emp = (Employee) session.get(Employee.class,empNo );
			tx.commit();
			System.out.println("Department Created");
			return emp;		
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
			 tx.rollback();
			 System.out.println("Problem Generating Department");
			}
			return emp;
		}finally{
			session.close();
		}
				
	}

	@Override
	public Department getDepartmentDetails(int deptId) {
		// TODO Auto-generated method stub
		Department dept = null;
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			dept = (Department) session.get(Department.class,deptId );
			tx.commit();
			System.out.println("Department Details Generated");
			return dept;		
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
			 tx.rollback();
			 System.out.println("Problem Generating Department Details");
			}
			return dept;
		}finally{
			//session.close();
		}

	}
}
