package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Course;
import com.model.Student;
import com.util.HibernateUtil;

public class ManytoManyDAO implements ManytoManyDaoi {

	Session session = null;
	Transaction tx = null;
	
	@Override
	public void addStudents(Student stud) {
		// TODO Auto-generated method stub
		
		try{
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(stud);
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
	public void addCourses(Course course) {
		// TODO Auto-generated method stub
		
	}

}
