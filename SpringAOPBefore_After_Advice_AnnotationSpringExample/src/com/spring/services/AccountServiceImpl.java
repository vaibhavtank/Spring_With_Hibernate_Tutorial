package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.dao.AccountDAO;
import com.spring.exceptions.MyException;

@Service("accountServices")
public class AccountServiceImpl implements AccountServices {
	
	@Autowired
	@Qualifier("accountDAO")
	private AccountDAO accountDAO;
	
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	AccountServiceImpl(AccountDAO ad){
		accountDAO = ad;
	}

	@Override
	public boolean deposit(int accno, double amt) throws MyException {
		
		System.out.println("Deposite Method Call");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrow(int accno, double amt) throws MyException {
		// TODO Auto-generated method stub
		
		System.out.println("Withdrow Method Call");
		return false;
	}

}
