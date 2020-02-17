package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.IStudenDetailsService;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {

	private IStudenDetailsService service;
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentDetails details) {
		service.saveStudentDetails(details);
		return "saved With Id:  "+details.getSid();
	}
	
}
