package com.spring.services;

import com.spring.dao.AccountDAO;
import com.spring.exceptions.MyException;

public class AccountServiceImpl implements AccountServices {
	
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
