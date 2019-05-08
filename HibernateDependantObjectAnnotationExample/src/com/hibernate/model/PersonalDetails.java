package com.hibernate.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Parent;

@Entity
@Table(name="PersonalDetails")
public class PersonalDetails {

	private int pid;
	private String Firstname,lastname;
	private Address PermenentAddress,presentAddress;
	
	@Id
	@Column(name="Pid")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(name="firstname")
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	
	@Column(name="lastname")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street" ,column=@Column(name="permenent_Street")),
		@AttributeOverride(name="city" ,column=@Column(name="permenent_city")),
		@AttributeOverride(name="state" ,column=@Column(name="permenent_State")),
		@AttributeOverride(name="pin" ,column=@Column(name="permenent_Pin")),
	})
	
	@Column(name="permenentAddress")
	public Address getPermenentAddress() {
		return PermenentAddress;
	}
	public void setPermenentAddress(Address permenentAddress) {
		PermenentAddress = permenentAddress;
	}
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street" ,column=@Column(name="present_Street")),
		@AttributeOverride(name="city" ,column=@Column(name="present_city")),
		@AttributeOverride(name="state" ,column=@Column(name="present_State")),
		@AttributeOverride(name="pin" ,column=@Column(name="pesent_Pin")),
	})
	@Column(name="presentAddress")
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	
	
	
}
