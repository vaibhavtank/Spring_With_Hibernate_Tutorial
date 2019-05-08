package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;


 
public interface EmployeeDao {
 
    String saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
}