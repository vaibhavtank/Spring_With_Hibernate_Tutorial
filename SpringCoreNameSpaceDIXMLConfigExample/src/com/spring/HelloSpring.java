package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloSpring {

	private String message;
	private List mylist;
	private Set myset;
	private Map mymap;
	
	//Constructor Dependency Injection
	
	public HelloSpring() {
		// TODO Auto-generated constructor stub
	}
	
	public HelloSpring(String message){
		this.message = message;
	}
	
	HelloSpring(String message, List mylist){
		this.message = message;
		this.mylist = mylist;
	}
	
	HelloSpring(String message,List mylist, Set myset){
		this.message = message;
		this.mylist = mylist;
		this.myset = myset;
	}
	
	HelloSpring(String message,List mylist, Set myset, Map mymap){
		this.message = message;
		this.mylist = mylist;
		this.myset = myset;
		this.mymap = mymap;
	}

	// Setter Getter Dependency Injections
	
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void setMylist(List mylist) {
		this.mylist = mylist;
	}
	
	
	public void printMessage(){
		System.out.println(message);
	}
	
	public void printList(){
		System.out.println(mylist);
	}
	
	public void printSet(){
		System.out.println(myset);
	}
	
	public void printMap(){
		System.out.println(mymap);
	}

	public void setMyset(Set myset) {
		this.myset = myset;
	}

	public void setMymap(Map mymap) {
		this.mymap = mymap;
	}
	
}
