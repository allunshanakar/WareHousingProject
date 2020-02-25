package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Marks {

	@Id
	//@GeneratedValue
	private String test_id;
	private String subject;
	private String result;
	private Integer marks;
}
