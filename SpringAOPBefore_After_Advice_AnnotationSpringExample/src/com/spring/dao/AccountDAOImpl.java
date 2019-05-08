package com.spring.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.spring.exceptions.MyException;

@Repository
@Qualifier("accountDAO")
@Scope("singleton")
public class AccountDAOImpl implements AccountDAO{

	@Override
	public void setBalance(int accno, double amt) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance(int accno) throws MyException {
		// TODO Auto-generated method stub
		
	}

}
