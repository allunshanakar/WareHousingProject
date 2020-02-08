package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UnitOfMeasure;
import com.example.demo.repository.UomRepository;
import com.example.demo.service.IUnitOfMeasureService;

@Service
public class UnitOfMeasureServiceImpl implements IUnitOfMeasureService{
	@Autowired
	private UomRepository repository;
	
	@Override
	public Integer saveUom(UnitOfMeasure unitOfMeasure) {
		
		repository.save(unitOfMeasure);
		return unitOfMeasure.getId();
	}
	
}
