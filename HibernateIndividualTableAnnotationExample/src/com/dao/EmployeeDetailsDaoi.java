package com.dao;

import com.model.HourlyEmployee;
import com.model.SalariedEmployee;

public interface EmployeeDetailsDaoi {
	
	public void createHourlyEmployeeDetails(HourlyEmployee employee);
	public void createSalariedEmployeeDetails(SalariedEmployee employee);

}
