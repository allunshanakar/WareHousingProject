package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Adress {

	@Id
	//@GeneratedValue
	private Integer a_id;
	private String street;
	private String state;
	private String city;
}
