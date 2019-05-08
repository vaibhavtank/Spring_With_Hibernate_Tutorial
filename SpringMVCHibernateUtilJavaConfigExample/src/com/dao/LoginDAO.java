package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.model.LoginModel;
import com.util.HibernateUtil;

@Repository
@Qualifier("logindao")
@Scope("singleton")
public class LoginDAO  implements LoginDAOi{

	Session session = null;
	Transaction tx = null;
	
	
	@Override
	public String insertRecord(LoginModel model) {
		// TODO Auto-generated method stub
		
		String result = null;
		
		try{
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(model);
			tx.commit();
			System.out.println("Employee Created");
			return "success";
			}catch(Exception e){
				System.out.println("Exception in creating in Employee");
				tx.rollback();
				return "error";
			}finally{
				session.disconnect();
			}

	}

}
