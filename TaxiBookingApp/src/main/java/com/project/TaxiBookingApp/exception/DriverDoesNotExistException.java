package com.project.TaxiBookingApp.exception;

public class DriverDoesNotExistException extends Exception{
	
	private String msg;

	public DriverDoesNotExistException(String msg) {
		super();
		this.msg = msg;
	}

	public DriverDoesNotExistException() {
		super();
	}
	
	

}
