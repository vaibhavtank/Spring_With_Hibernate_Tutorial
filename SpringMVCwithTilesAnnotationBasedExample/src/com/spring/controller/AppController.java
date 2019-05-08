package com.spring.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Product;



@Controller
public class AppController {
	
	// Map requests to Home Page
    @RequestMapping("/")
    public String welcome(Model model){
        String message = "Welcome to Spring MVC";
        model.addAttribute("welcomeMessage", message);
        return "myapp.homepage";
    }
    
    // Map requests to product Page
    @RequestMapping("/products")
    public String products(Model model){
        ArrayList<Product> products = getAllProducts();
        model.addAttribute("products",products);
        return "myapp.products";
    }
    
    /* Convenience method to get a list of In Memory products, 
    In actual scenario this should come from a Repository via a Service */

   private ArrayList<Product> getAllProducts() {

       ArrayList<Product> productList = new ArrayList<Product>();

       Product p1 = new Product("Apple iPhone 5s","Smart Phone","iphone.jpg",250);
       Product p2 = new Product("Samsung Galaxy S6","Smart Phone","s6.jpg",300);
       Product p3 = new Product("LG Nexus 5","Smart Phone","nexus.jpg",100);
       Product p4 = new Product("HTC One M9","Smart Phone","htc.jpg",300);

       productList.add(p1);
       productList.add(p2);
       productList.add(p3);
       productList.add(p4);

       return productList;
   }


}
