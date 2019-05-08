package action;

import model.User;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;

@Action("/doLogin")
@ResultPath("/WEB-INF/views")
@Results({
	@Result(name="success",location="LoginSuccess.jsp"),
	@Result(name="error",location="LoginError.jsp")
})
public class DoLoginAction extends ActionSupport {
	@Autowired
	private UserDAO userDAO;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute(){
		
		if(userDAO.checkLogin(user)){
		  return SUCCESS;
		}
		return ERROR;
	}
	
	

}
