package com.example.demo.exception;


@SuppressWarnings("serial")
public class UomTypeNotFoundException extends RuntimeException{

	public UomTypeNotFoundException(String message) {
		super(message);
	}

	public UomTypeNotFoundException() {
		super();
	}
}
