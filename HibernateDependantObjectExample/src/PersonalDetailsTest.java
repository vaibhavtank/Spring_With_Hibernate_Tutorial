import java.util.List;

import com.dao.PersonalDetailsDAO;
import com.dao.PersonalDetailsDAOi;
import com.model.Address;
import com.model.PersonalDetails;


public class PersonalDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonalDetailsDAOi  dao = new PersonalDetailsDAO();
		
		Address address = new Address();
		address.setStreet("Chandkheda");
		address.setState("Gujarat");
		address.setCity("Ahmedabad");
		address.setPin(382424);
		
		
		PersonalDetails pd = new PersonalDetails();
		
		pd.setFirstname("Devang");
		pd.setLastname("Chauhan");
		pd.setPermenentAddress(address);
		pd.setPresentAddress(address);
		
	    dao.createPersonalDetails(pd);
	    
	    
	    List<PersonalDetails> list = dao.showPersonalDetails();
	    
	    for(PersonalDetails details : list){
	    	
	    	System.out.println("Personal Details are Below");
	    	System.out.println("Personal details = "+details.getPid());
	    	System.out.println("Personal Firstname = "+details.getFirstname());
	    	System.out.println("Personal Lastname = "+details.getLastname());
	    	System.out.println("Personal Permenent Steet = "+details.getPermenentAddress().getStreet());
	    	System.out.println("Personal Permenent State = "+details.getPermenentAddress().getState());
	    	System.out.println("Personal Permenent city = "+details.getPermenentAddress().getCity());
	    	System.out.println("Personal Permenent pin = "+details.getPermenentAddress().getPin());
	    	System.out.println("Personal Permenent Steet = "+details.getPresentAddress().getStreet());
	    	System.out.println("Personal Permenent State = "+details.getPresentAddress().getState());
	    	System.out.println("Personal Permenent city = "+details.getPresentAddress().getCity());
	    	System.out.println("Personal Permenent pin = "+details.getPresentAddress().getPin());
	    	
	    }
	    

	}

}
