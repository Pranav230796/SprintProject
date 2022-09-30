package com.project.TaxiBookingApp.exception;

public class ReportDoesNotExistException extends Exception{
	
	private String msg;

	public ReportDoesNotExistException(String msg) {
		super();
		this.msg = msg;
	}

	public ReportDoesNotExistException() {
		super();
	}
}
