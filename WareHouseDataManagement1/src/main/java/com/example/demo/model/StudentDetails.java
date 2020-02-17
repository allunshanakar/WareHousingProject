package com.example.demo.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String name;
	private String college;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Adress> address;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Marks> marks;
}
