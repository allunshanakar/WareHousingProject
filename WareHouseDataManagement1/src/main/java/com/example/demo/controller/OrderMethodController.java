package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderMethod;
import com.example.demo.service.IOrderMethodService;

@RestController
@RequestMapping("/ordermethod")
public class OrderMethodController {

	@Autowired
	private IOrderMethodService service;
	@PostMapping("/save")
	public Integer saveOrderMethod(@RequestBody OrderMethod orderMethod) {
		
		service.saveOrderMethod(orderMethod);
		return orderMethod.getId();
	}
}
