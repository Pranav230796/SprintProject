package com.project.TaxiBookingApp.entity;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class User {
	
	@Size(min = 3,max=15,message="Username does not meet the size requirement")
	private String username;
	@Pattern(regexp="^[q-z-0]{3}",message="The password can contain only characters and letters ")
	private String password;
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="phoneNo should be 10 digits")
	private String phoneNo;
	@Email(message = "Enter valid email.....")
	private String emailId;
	private String address;
		
	public User(String username, String password, String phoneNo, String emailId, String address) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
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

	public String getPhoneNo() {
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

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
