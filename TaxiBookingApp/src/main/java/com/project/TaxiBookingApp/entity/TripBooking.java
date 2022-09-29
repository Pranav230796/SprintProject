package com.project.TaxiBookingApp.entity;

import java.time.LocalDateTime;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class TripBooking {

	@Id
	private int tripBookingId;
	private int customerId;
//	private Driver driver;
	private String fromLocation;
	private String toLocation;
	private LocalDateTime fromDateTime;
	private LocalDateTime toDateTime;
	private Boolean status;
	private float distanceInKm;
	
	public TripBooking() {
		super();
	}


	public TripBooking(int tripBookingId, int customerId, String fromLocation, String toLocation,
			LocalDateTime fromDateTime, LocalDateTime toDateTime, Boolean status, float distanceInKm) {
		super();
		this.tripBookingId = tripBookingId;
		this.customerId = customerId;
//		this.driver = driver;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
		this.status = status;
		this.distanceInKm = distanceInKm;
	}
	
	
	public int getTripBookingId() {
		return tripBookingId;
	}
	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
//	public Driver getDriver() {
//		return driver;
//	}
//	public void setDriver(Driver driver) {
//		this.driver = driver;
//	}
	
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public LocalDateTime getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(LocalDateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public LocalDateTime getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(LocalDateTime toDateTime) {
		this.toDateTime = toDateTime;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public float getDistanceInKm() {
		return distanceInKm;
	}
	public void setDistanceInKm(float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	
	
}
