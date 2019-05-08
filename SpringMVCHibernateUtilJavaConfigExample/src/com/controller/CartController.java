package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Cart;
import com.model.Product;

@Controller
@RequestMapping(value = "/cart")
public class CartController {

	@Autowired
	Cart cart;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/add/{pid}/{pname}")
	public String addCart(@PathVariable int pid, @PathVariable String pname) {
		System.out.println("called");
		Product p=new Product();
		p.setPid(pid);
		p.setPname(pname);
		cart.addProduct(p);
		return "redirect:/";
	}
}
