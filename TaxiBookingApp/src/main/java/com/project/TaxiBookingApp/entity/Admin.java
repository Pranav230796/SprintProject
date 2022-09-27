package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin extends User{
	
	@Id
	private int id;
	
	public Admin() {
		super();
	}

	public Admin(String username, String password, long phoneNo, String emailId, int id) {
		super(username, password, phoneNo, emailId);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
