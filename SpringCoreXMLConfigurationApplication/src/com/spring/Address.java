package com.spring;

public class Address {
	
	String city;
	
	public Address(String city){
		this.city = city;
	}

	
	public void getCity(){
		System.out.println(city.toString());
	}
}
