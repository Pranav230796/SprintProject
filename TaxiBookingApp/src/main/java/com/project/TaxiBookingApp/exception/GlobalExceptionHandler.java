package com.project.TaxiBookingApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value=AdminAlreadyExistException.class)
	public ResponseEntity<String> adminAlreadyExsits(AdminAlreadyExistException adminAlreadyExistsException){
		return new ResponseEntity<String>("Admin Already Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=CustomerAlreadyExistException.class)
	public ResponseEntity<String> customerAlreadyExsits(CustomerAlreadyExistException customerAlreadyExistsException){
		return new ResponseEntity<String>("Customer Already Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=DriverAlreadyExistException.class)
	public ResponseEntity<String> driverAlreadyExsits(DriverAlreadyExistException driverAlreadyExistsException){
		return new ResponseEntity<String>("Driver Already Exist",HttpStatus.CONFLICT);
	}
}

