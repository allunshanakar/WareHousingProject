package com.example.demo.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrderMethod {
	@Id
	@GeneratedValue
	private Integer id;
	private String orderMode;
	private String orderCode;
	 @ElementCollection(fetch = FetchType.EAGER)
	 private List<String> orderAccept;
	 private String description;
}
