package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("empdao-oracle")
@Scope("singleton")
public class EmployeeDAOImpl implements EmployeeDAO {

@Autowired(required=true)
@Qualifier("oracle")
private DataSource datasource;
	
	@Override
	public double getSal(int eno) {
		// TODO Auto-generated method stub
	    Connection con = null;	
	    
	    try{
	    	
	    	con = datasource.getConnection();
	    	PreparedStatement ps = con.prepareStatement("select sal from emp where empno=?");
	    	ps.setInt(1, eno);
	    	ResultSet rs = ps.executeQuery();
	    	if(rs.next())
	    		return rs.getDouble(1);
	    	throw new RuntimeException("Employee not Found");
	    	
	    }catch(Exception e){
	    	e.printStackTrace();
	    	throw new RuntimeException();
	    }finally{
	    	try{
	    		con.close();
	    	}catch(Exception e){}
	    }
	 
	}

	@Override
	public void setSal(int eno, double sal) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
		try{
			 con = datasource.getConnection();
			 PreparedStatement ps = con.prepareStatement("update emp set sal = ? where empno =  ?");
			 
			 ps.setDouble(1,sal);
			 ps.setInt(2, eno);
			 
			 int count = ps.executeUpdate();
			 
			 if(count == 1 || count== Statement.SUCCESS_NO_INFO){
				 return;
			 }
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				con.close();}catch(Exception e){}
		}
		
	}
	@PostConstruct
	public void init() throws Exception{
		System.out.println(" DAO Beans Initialize");
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("DAO Beans Destroy");
	}


}
