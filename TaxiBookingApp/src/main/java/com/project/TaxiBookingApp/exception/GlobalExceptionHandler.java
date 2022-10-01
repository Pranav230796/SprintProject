package com.project.TaxiBookingApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.Taxi;

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
	
	@ExceptionHandler(value=AdminDoesNotExistException.class)
	public ResponseEntity<String> adminDoesNotExsits(AdminDoesNotExistException adminDoesNotExists){
		return new ResponseEntity<String>("Admin Does Not Exists",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=DriverDoesNotExistException.class)
	public ResponseEntity<String> driverDoesNotExsits(DriverDoesNotExistException driverDoesNotExists){
		return new ResponseEntity<String>("Driver Does Not Exists",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=TaxiAlreadyExistException.class)
	public ResponseEntity<String> taxiAlreadyExist(TaxiAlreadyExistException taxiAlreadyExist){
		return new ResponseEntity<String>("Taxi Already Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=ReportAlreadyExistException.class)
	public ResponseEntity<String> reportAlreadyExist(ReportAlreadyExistException reportAlreadyExist){
		return new ResponseEntity<String>("Report Already Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=ReportDoesNotExistException.class)
	public ResponseEntity<String> reportDoesNotExist(ReportDoesNotExistException reportDoesNotExist){
		return new ResponseEntity<String>("Report Does Not Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=CustomerDoesNotExistException.class)
	public ResponseEntity<String> customerDoesNotExist(CustomerDoesNotExistException customerDoesNotExist){
		return new ResponseEntity<String>("Customer Does Not Exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=TaxiDoesNotExistException.class)
	public ResponseEntity<String> taxitDoesNotExist(TaxiDoesNotExistException taxiDoesNotExist){
		return new ResponseEntity<String>("Taxi Does Not Exist",HttpStatus.CONFLICT);
	}
}

