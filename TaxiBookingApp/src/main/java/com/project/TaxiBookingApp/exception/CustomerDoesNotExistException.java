package com.project.TaxiBookingApp.exception;

public class CustomerDoesNotExistException extends  Exception {
	
	private String msg;

	public CustomerDoesNotExistException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public CustomerDoesNotExistException() {
		super();
	}
}
