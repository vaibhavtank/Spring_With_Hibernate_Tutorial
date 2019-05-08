package com.spring;

public class HelloSpring {

	String message;
	
	public HelloSpring() {
		// TODO Auto-generated constructor stub
		
	     message = "Hello Spring";
	}
	
	public HelloSpring(String message){
		this.message = message;
	}
	
	public void geMessage(){
		System.out.println(message);
	}
	
}
