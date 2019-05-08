package com.test;

import java.util.Set;

import com.dao.EmployeeDetailsDAO;
import com.dao.EmployeeDetailsi;
import com.model.Department;
import com.model.Employee;

public class HibernateRelationshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetailsi dao = new EmployeeDetailsDAO();
		
	/*	// Add Department Details
		
		Department dept = new Department();
		dept.setDeptid(1);
		dept.setDeptName("ITEnabledServices");
		
		dao.addDepartmentDetails(dept);
		
		//Add Employee Details
		
		Employee emp = new Employee();
		
		emp.setEmpno(1);
		emp.setUserName("Devang");
		emp.setDept(dept);
		
		dao.addEmployeeDetails(emp); */
		
		//Get Employee Details
		
		Employee emp1  = dao.getEmployeeDetails(1);
		Department dept1 = emp1.getDept();
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getUserName());
		System.out.println((dept1.getDeptName()));
		
		
		//Get Department Details
		
		Department dept2 = dao.getDepartmentDetails(1);
		
		System.out.println("Department Name is :"+dept2.getDeptName());
		Set<Employee> em = dept2.getEmp();
		for(Employee e: em){
			System.out.println("User Name is" +e.getUserName());
		}
		
		}
		
	}


