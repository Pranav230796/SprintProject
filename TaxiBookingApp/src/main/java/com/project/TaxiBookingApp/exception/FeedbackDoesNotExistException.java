package com.project.TaxiBookingApp.exception;

public class FeedbackDoesNotExistException extends Exception{
	
	private String msg;

	public FeedbackDoesNotExistException(String msg) {
		super();
		this.msg = msg;
	}

	public FeedbackDoesNotExistException() {
		super();
	}
}
