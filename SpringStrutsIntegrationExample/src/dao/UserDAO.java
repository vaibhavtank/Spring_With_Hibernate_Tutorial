package dao;

import model.User;

public class UserDAO {
	
	
	public boolean checkLogin(User user) {
		// TODO Auto-generated method stub
		return user.getUsername().equals("admin")
                && user.getPassword().equals("nimda");
		
	}

}
