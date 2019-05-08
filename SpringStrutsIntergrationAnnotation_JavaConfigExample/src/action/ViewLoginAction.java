package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Action("login")
@ResultPath("/WEB-INF/views")
@Result(name="success", location="LoginForm.jsp")
public class ViewLoginAction extends ActionSupport{
  // this is internally Empty
}
