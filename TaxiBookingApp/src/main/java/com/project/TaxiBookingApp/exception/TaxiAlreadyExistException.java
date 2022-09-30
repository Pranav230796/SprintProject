package com.project.TaxiBookingApp.exception;

public class TaxiAlreadyExistException extends Exception{
	
	private String msg;

	public TaxiAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public TaxiAlreadyExistException() {
		super();
	}
	

}
