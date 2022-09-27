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

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
