import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.HibernateDAO;
import com.hibernate.model.Employee;
import com.util.HibernateUtil;


public class HibernateTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HibernateDAO dao = new HibernateDAO();
	   
		//Create Employee
		
		Employee emp = new Employee();
		emp.setEname("Devang");
		emp.setSal(500);
		emp.setJob("CLERK");
		emp.setDeptno(20);
		emp.setHiredate(new Date());
		
		dao.createEmployee(emp);
		
		System.out.println();
		
		//update Employee
		
		emp.setEname("Krunal");
		emp.setJob("Doctor");
		
		dao.updateEmployee(emp);
		
		//get Employee
		
		emp = dao.getEmployee(emp.getEmpno());
		
		System.out.println("Employee Details of empno = " + emp.getEmpno());
		System.out.println("Employee Name = " + emp.getEname());
		System.out.println("Employee Dept No = " + emp.getEmpno());
		System.out.println("Employee Job = " + emp.getJob());
		System.out.println("Employee Salary = " + emp.getSal());
		System.out.println("Employee HireDate = " + emp.getHiredate());
		
        System.out.println("employee Get"); 
		
		//Delete Employee
		
		 dao.removeEmployee(emp);
		 
		 System.out.println("Employee Deleted");
	}

}
