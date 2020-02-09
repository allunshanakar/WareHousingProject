package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class CustomizedExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = UomTypeNotFoundException.class)
	protected ResponseEntity<Object> exception(UomTypeNotFoundException ex){
		
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}
}
