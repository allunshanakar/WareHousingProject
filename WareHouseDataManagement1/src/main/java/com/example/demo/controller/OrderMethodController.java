package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> saveOrderMethod(@RequestBody OrderMethod orderMethod) {
		ResponseEntity<?> response=null;
		try {
			service.saveOrderMethod(orderMethod);
			response=new ResponseEntity<String>("saved With"+orderMethod.getId(),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			response=new ResponseEntity<String>("Data Not saved"+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}
}
