package com.spring.model;


import java.math.BigDecimal;
 


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employeemodel")
@Entity
@Table(name="EMPLOYEE")
public class Employee {
 
	private int id;
	private String username,password;
	
	@Id
	@GenericGenerator(name="increment",strategy="org.hibernate.id.IncrementGenerator")
	@GeneratedValue(generator="increment")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="UserName")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="Password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}    
 
}