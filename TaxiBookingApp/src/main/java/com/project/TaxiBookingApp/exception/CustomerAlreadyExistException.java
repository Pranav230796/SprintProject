package com.project.TaxiBookingApp.exception;

public class CustomerAlreadyExistException extends Exception{
	
	private String msg;

	public CustomerAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public CustomerAlreadyExistException() {
		super();
	}
	
	

}
