package com.spring;

public class Person {
	
	String name;
	String surname;
	Address address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name,String surname) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name,String surname, Address address){
		this.name = name;
		this.surname = surname;
		this.address = address;
	}
	
	public void getValue(){
		System.out.println("name ="+ name + "surname = "+surname + "City =" );
		address.getCity();
	}

}
