package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

	List<Product> products = new ArrayList();

	public void addProduct(Product p) {
		System.out.println("Called");
		for(Product p1:products){
			System.out.println(p1.pname);
		}
		products.add(p);
	}

	public List<Product> getAllProducts() {
		return products;
	}
}
