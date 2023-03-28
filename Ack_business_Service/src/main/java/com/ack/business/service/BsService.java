package com.ack.business.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.core.entity.OrderHeader;

@Service
public class BsService {
	
	RestTemplate resttemp = new RestTemplate();
	
	@Autowired
	private Environment env;
	
	public OrderHeader saveOrder(@RequestBody OrderHeader order) {
		
		
		  String coreRoot = env.getProperty("api.core.root");
		  String url = coreRoot +"/saveorder"; 
		  HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		  HttpEntity<OrderHeader> httpEntity = new HttpEntity<>(order, httpHeaders);
		 // ResponseEntity<OrderHeader> response = resttemp.exchange(url,HttpMethod.POST, httpEntity, OrderHeader.class);
		  ResponseEntity<OrderHeader> response = resttemp.exchange(url, HttpMethod.POST, httpEntity, OrderHeader.class, httpHeaders);
		  return response.getBody();
		 
		
	}

}
