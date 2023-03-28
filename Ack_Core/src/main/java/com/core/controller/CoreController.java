package com.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.AdDocuments;
import com.core.entity.OrderHeader;
import com.core.entity.ProductInfo;
import com.core.service.OrderService;

@RestController
public class CoreController {
	@Autowired
	private OrderService serv;
	
	@PostMapping("/saveorder")
	public OrderHeader addOrder(@RequestBody OrderHeader order) {
		
		OrderHeader addOrder = serv.addOrder(order);
		
		AdDocuments adDocuments = serv.AdDocumentsGenerateAndPersist(order);
		System.out.println(adDocuments);		
		return addOrder;
	}
	@PostMapping("/adproduct")
	 public ProductInfo saveProduct(@RequestBody ProductInfo product) {
		 
		 ProductInfo addProduct = serv.addProduct(product);
		 return addProduct;
		 
	 }
	
	

}
