package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="UnitOfMeasure")
@Data
public class UnitOfMeasure {
	@Id
	@GeneratedValue
	private Integer id;
	private String viswa;
	private String uomType;
	private String uomModel;
	private String description;
	
}
