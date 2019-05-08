package com.dao;

import com.model.Department;
import com.model.Employee;

public interface EmployeeDetailsi {
	
	public void addDepartmentDetails(Department dept);
	public void addEmployeeDetails(Employee emp);
	public Employee getEmployeeDetails(int empNo);
	public Department getDepartmentDetails(int deptId);
	

}
