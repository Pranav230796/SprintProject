package com.project.TaxiBookingApp.entity;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer extends User{
	
	@Id
	private int id;
	
	public Customer() {
		super();
	}

	public Customer(String username, String password, String phoneNo, String emailId, int id) {
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

