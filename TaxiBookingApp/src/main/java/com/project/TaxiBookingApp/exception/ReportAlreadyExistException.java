package com.project.TaxiBookingApp.exception;

public class ReportAlreadyExistException extends Exception{
	
	private String msg;
	
	public ReportAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}
	public ReportAlreadyExistException() {
		super();
	}

}
