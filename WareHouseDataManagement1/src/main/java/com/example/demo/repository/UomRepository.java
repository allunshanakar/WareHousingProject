package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UnitOfMeasure;


public interface UomRepository extends JpaRepository<UnitOfMeasure, Integer> {

}
