package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver extends User{
	
	@Id
	private int driverId;
	
	private String address;
	
	
	private String licenceNo;
	private float rating;
	
	public Driver() {
		super();
	}

	public Driver(String username, String password, long phoneNo, String emailId, int driverId, String address,
			String licenceNo, float rating) {
		super(username, password, phoneNo, emailId);
		this.driverId = driverId;
		this.address = address;
		this.licenceNo = licenceNo;
		this.rating = rating;
	}

	public int getDriverId() {
		return driverId;
	}

	public String getAddress() {
		return address;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public float getRating() {
		return rating;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
