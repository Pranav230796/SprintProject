package com.project.TaxiBookingApp.exception;

public class DriverAlreadyExistException extends Exception{
	
	private String msg;

	public DriverAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public DriverAlreadyExistException() {
		super();
	}
	
	

}
