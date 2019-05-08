package com.spring;

public class HelloSpring {
	
	String message;
	Person p;
	

	public void setP(Person p) {
		this.p = p;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage(){
		System.out.println(message);
	}
	
	
	public void printValue(){
		System.out.println( message + p.name + p.surname );
	}
	

}
