package com.model;

public class PersonalDetails {

	private int pid;
	private String Firstname,lastname;
	private Address PermenentAddress,presentAddress;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Address getPermenentAddress() {
		return PermenentAddress;
	}
	public void setPermenentAddress(Address permenentAddress) {
		PermenentAddress = permenentAddress;
	}
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	
	
	
}
