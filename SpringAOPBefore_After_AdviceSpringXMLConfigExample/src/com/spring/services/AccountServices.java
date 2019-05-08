package com.spring.services;

import com.spring.exceptions.MyException;

public interface AccountServices {

	boolean deposit(int accno,double amt)throws MyException;
	boolean withdrow(int accno,double amt) throws MyException;
}
