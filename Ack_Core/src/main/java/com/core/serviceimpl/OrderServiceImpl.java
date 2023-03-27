package com.core.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.Repository.OrderHeaderRepository;
import com.core.entity.OrderHeader;
import com.core.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderHeaderRepository orderRepo;

	@Override
	public OrderHeader addOrder(OrderHeader order) {
		OrderHeader save = orderRepo.save(order);
		return save;
	}

}
