package com.project.TaxiBookingApp.entity;

public abstract class User {
	
	protected String username;
	protected String password;
	protected long phoneNo;
	protected String emailId;
		
	public User(String username, String password, long phoneNo, String emailId) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public User() {
		super();
	}
	
}
