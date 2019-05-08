import java.util.List;

import com.hibernate.dao.PersonalDetailsDAO;
import com.hibernate.dao.PersonalDetailsDAOi;
import com.hibernate.model.Address;
import com.hibernate.model.PersonalDetails;


public class PersonalDetailsTest1  {

	
	public static void main(String[] args) {
	
	   Address permenentAddress  = new Address();
	   permenentAddress.setPin(380013);
	   permenentAddress.setCity("Ahmedabad");
	   permenentAddress.setState("Gujarat");
	   permenentAddress.setStreet("Naranpura");
	   
	   
	   Address presentAddress = new Address();
	   presentAddress.setPin(3802424);
	   presentAddress.setCity("Ahemdabad");
	   presentAddress.setState("Gujarat");
	   presentAddress.setStreet("Chandkheda");
	   
	   
	   PersonalDetails details = new PersonalDetails();
	   details.setPid(1);
	   details.setFirstname("Devang");
	   details.setLastname("Chauhan");
	   details.setPermenentAddress(permenentAddress);
	   details.setPresentAddress(presentAddress);
	   
	   
	   PersonalDetailsDAOi dao = new PersonalDetailsDAO();
	   dao.createPersonalDetails(details);
	   System.out.println("Employeee Personal Details Created");
	   
	   List<PersonalDetails> list = dao.showPersonalDetails();
	   
	   for(PersonalDetails  pd: list ){
		   
		   System.out.println("Employee Details Are");
		   
		   
		   System.out.println("Employee Id"+pd.getPid());
		   System.out.println("Firstname :"+ pd.getFirstname());
		   System.out.println("Lastname :"+ pd.getLastname());
		   
		   Address permenentAddressdetails = pd.getPermenentAddress();
		   
		   System.out.println(permenentAddressdetails.getStreet());
		   System.out.println(permenentAddressdetails.getState());
		   System.out.println(permenentAddressdetails.getCity());
		   System.out.println(permenentAddressdetails.getPin() );
		   
		   Address pesentAddressdetails = pd.getPermenentAddress();
		   
		   System.out.println(pesentAddressdetails.getStreet());
		   System.out.println(pesentAddressdetails.getState());
		   System.out.println(pesentAddressdetails.getCity());
		   System.out.println(pesentAddressdetails.getPin() );
		  
		  
		   
	   }
   	
	
	}

}
