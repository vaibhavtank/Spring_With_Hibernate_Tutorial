package com.test;

import com.dao.EmployeDetailsDao;
import com.dao.EmployeeDetailsDaoi;
import com.model.Employee;
import com.model.HourlyEmployee;
import com.model.SalariedEmployee;

public class HibernateInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		
		
		hourlyEmployee.setEmpno(1);
		hourlyEmployee.setName("Devang");
		hourlyEmployee.setHourlyRate(1000.00);
		hourlyEmployee.setMaxHoursPerDay(8);
		
		EmployeeDetailsDaoi dao = new EmployeDetailsDao();
		dao.createHourlyEmployeeDetails(hourlyEmployee);
	*/
		
		
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		
		salariedEmployee.setEmpno(2);
		salariedEmployee.setName("Krunal");
		salariedEmployee.setAnnualSalary(20000);
		
		EmployeeDetailsDaoi dao = new EmployeDetailsDao();
		dao.createSalariedEmployeeDetails(salariedEmployee);

	}

}
