package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UomTypeNotFoundException;
import com.example.demo.model.UnitOfMeasure;
import com.example.demo.service.IUnitOfMeasureService;


@RestController
@RequestMapping("/uom")
public class UnitOfMeasureController {

	@Autowired
	private IUnitOfMeasureService unitOfMeasure;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody UnitOfMeasure uom) {
		
		ResponseEntity<String> response=null;
		try {
			
				if(uom.getUomType()!=null) {
					Integer id=unitOfMeasure.saveUom(uom);
					response=new ResponseEntity<>("saved with id:"+id,HttpStatus.OK);
				}
				else {
					throw new UomTypeNotFoundException("Type Not found");
				}
			
		} catch (Exception e) {
             response=new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return response;
		
		
		
	}
}
