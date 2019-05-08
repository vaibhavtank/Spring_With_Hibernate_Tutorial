package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 



import com.spring.model.Employee;
 
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
 
	
	@Autowired
    private SessionFactory sessionFactory = null;
 
	

    public String saveEmployee(Employee employee) {
    	System.out.println("sessionfactory found :"+sessionFactory);
      sessionFactory.openSession().persist(employee);
        return "success";
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
        return (List<Employee>) criteria.list();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query query = sessionFactory.getCurrentSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
     
    public Employee findBySsn(String ssn){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("ssn",ssn));
        return (Employee) criteria.uniqueResult();
    }
     
    public void updateEmployee(Employee employee){
        sessionFactory.getCurrentSession().update(employee);
    }
     
}