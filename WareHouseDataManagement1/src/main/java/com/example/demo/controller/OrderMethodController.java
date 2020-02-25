package com.example.demo.controller;

import org.apache.log4j.Logger;
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
	
	private static Logger log=Logger.getLogger(OrderMethodController.class);

	@Autowired
	private IOrderMethodService service;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveOrderMethod(@RequestBody OrderMethod orderMethod) {
		log.info("save method started");
		ResponseEntity<?> response=null;
		try {
			
			log.info("service layer method call started");
			service.saveOrderMethod(orderMethod);
			log.info("getting response from save method");
			response=new ResponseEntity<String>("saved With"+orderMethod.getId(),HttpStatus.OK);
			log.debug("ordermethod saved with"+orderMethod.getId()+"-->"+HttpStatus.OK);
		} 
		catch (Exception e) {
			log.info("saving ordermethod not working");
			e.printStackTrace();
		
			response=new ResponseEntity<String>("Data Not saved"+e.getMessage(),HttpStatus.BAD_REQUEST);
			log.error("data not saved "+e.getMessage()+"-->"+HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}
}
