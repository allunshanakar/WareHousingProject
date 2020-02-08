package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderMethod;
import com.example.demo.repository.OrderMethodRepository;
import com.example.demo.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl implements IOrderMethodService{
	
	@Autowired
	private OrderMethodRepository repository;
	@Override
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		
		repository.save(orderMethod);
		return orderMethod.getId();
	}

}
