package com.project.TaxiBookingApp.exception;

public class TaxiDoesNotExistException extends Exception{
	
	private String msg;

	public TaxiDoesNotExistException(String msg) {
		super();
		this.msg = msg;
	}

	public TaxiDoesNotExistException() {
		super();
	}
	
	

}
