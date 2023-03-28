package com.ack.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ack.service.OrderService;
import com.core.entity.OrderHeader;

@Service
public class OrderServiceimpl implements OrderService {
	
	RestTemplate restTemp = new RestTemplate();
	
	@Autowired
	private Environment env;

	@Override
	public OrderHeader addOrder(OrderHeader order) {
		
		  String bsRoot = env.getProperty("api.bs.root"); 
		  String url =bsRoot+"/save";
		  HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		  HttpEntity<OrderHeader> httpEntity = new HttpEntity<>(order,httpHeaders);
		//  ResponseEntity<OrderHeader> response = restTemp.exchange(url,HttpMethod.POST,httpEntity,OrderHeader.class); 
		  ResponseEntity<OrderHeader> response = restTemp.exchange(url, HttpMethod.POST, httpEntity, OrderHeader.class, httpHeaders);
		  return response.getBody();
		 
		
	}

}
