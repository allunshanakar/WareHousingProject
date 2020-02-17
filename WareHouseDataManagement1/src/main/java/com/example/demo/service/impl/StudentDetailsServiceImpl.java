package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.service.IStudenDetailsService;
@Service
public class StudentDetailsServiceImpl 
                      implements IStudenDetailsService{
	@Autowired
	private StudentDetailsRepository repository;
	@Override
	public Integer saveStudentDetails(StudentDetails stdDetails) {
		repository.save(stdDetails);
		return stdDetails.getSid();
	}

}
