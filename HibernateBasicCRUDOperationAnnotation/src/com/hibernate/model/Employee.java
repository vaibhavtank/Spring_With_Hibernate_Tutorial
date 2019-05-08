package com.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee {
	
	private int empno,deptno;
	private String ename,job;
	private double sal;
	private Date hiredate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
    
	@Id
	@Column(name="empNo")
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Column(name="DepartmentNo")
	public int getDeptno() {
		return deptno;
	}
	@Column(name="DepartmentNo")
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Column(name="EmployeeName")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Column(name="JobType")
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Column(name="Salary")
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Column(name="Hire_Date")
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	

}
