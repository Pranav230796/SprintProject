package com.project.TaxiBookingApp.exception;

public class FeedbackAlreadyExistException extends Exception{
	
	private String msg;
	
	public FeedbackAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}
	public FeedbackAlreadyExistException() {
		super();
	}

}
