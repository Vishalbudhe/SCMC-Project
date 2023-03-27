package com.ack.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ack.business.service.BsService;
import com.core.entity.OrderHeader;

@RestController
public class BsController {
	@Autowired
	private BsService bsServ;
	
	@PostMapping("/save")
	public OrderHeader home(@RequestBody OrderHeader order) {
		bsServ.saveOrder(order);
		
		return null;
		
		
	}

}
