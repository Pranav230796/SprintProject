package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin extends User{
	
	@Id
	private int id;
	private String username;
	private String password;
	private long phoneNo;
	private String emailId;
	
	public Admin() {
		super();
	}

	public Admin(String username, String password, long phoneNo, String emailId, int id, String username2,
			String password2, long phoneNo2, String emailId2) {
		super();
		this.id = id;
		username = username2;
		password = password2;
		phoneNo = phoneNo2;
		emailId = emailId2;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
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
