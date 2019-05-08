package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="One_One_Personal_Details_Bidirectional")
public class PersonalDetails {

	private int pid;
	private String firstname,lastname;
	private Employee employeeDetails;
	
	@Id
	@GenericGenerator(name="increment",strategy="org.hibernate.id.IncrementGenerator")
	@GeneratedValue(generator="increment")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(name="First_Name")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="Last_Name")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="personalDetails")
	public Employee getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(Employee employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	
	
}
