package com.spring.dao;

import com.spring.exceptions.MyException;

public interface AccountDAO {

	void setBalance(int accno, double amt ) throws MyException;
	void getBalance(int accno) throws MyException;
	 
}
