package com.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_details")
public class Student {
	
	private int sid;
	private String fname,lname;
	private Collection<Course> courses;
	
	@Id
	@GenericGenerator(name="increment",strategy="org.hibenrnate.id.IncrementGenerator")
	@GeneratedValue(generator="increment")
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Column(name="Student_Fname")
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Column(name="Student_Lname")
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@ManyToMany
	@JoinTable(name="Students_Courses", 
	joinColumns=@JoinColumn(name="std_id"),
	inverseJoinColumns=@JoinColumn(name="course_id"))
	public Collection<Course> getCourses() {
		return courses;
	}
	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}
	
	
	

}
