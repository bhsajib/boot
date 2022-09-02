package com.spring.boot.myexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(CoustomerException.class)
	public ResponseEntity<?> handleException(CoustomerException e){
		
		return new ResponseEntity<>( e.getEr(), HttpStatus.valueOf(500));
		
	}

}
