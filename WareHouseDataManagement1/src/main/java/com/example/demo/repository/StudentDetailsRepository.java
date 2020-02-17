package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentDetails;

public interface StudentDetailsRepository 
                        extends JpaRepository<StudentDetails, Integer>{

}
