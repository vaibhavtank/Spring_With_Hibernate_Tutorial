package com.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoginDAO;
import com.model.LoginModel;
 
@Controller
@RequestMapping("/")
public class HomeController {
 
	
	@Autowired
	@Qualifier("logindao")
	LoginDAO dao;
	
	@Autowired
	@Qualifier("loginmodel")
	LoginModel loginmodel;
	String result = null;
	
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    	System.out.println("Home controller call");
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model,HttpServletRequest reqeust,HttpServletResponse response) {
    	
    	System.out.println("Login controller called");
    	
		loginmodel.setUsername(reqeust.getParameter("username"));
		loginmodel.setPassword(reqeust.getParameter("password"));
	
        result = dao.insertRecord(loginmodel);
        
        if(result.equals("success")){
          return "welcome";	
        }else{
        	return "error";
        }
	
    }
}