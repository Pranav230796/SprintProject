package com.project.TaxiBookingApp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@Entity
public class TripBooking {

	@Id
	private int tripBookingId;
	@OneToOne
	@JoinColumn(name="custId")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Driver driver;
	private String fromLocation;
	private String toLocation;
	private LocalDate fromDateTime;
	private LocalDate toDateTime;
	private Boolean status;
	private float distanceInKm;
	
	public TripBooking() {
		super();
	}


	public TripBooking(int tripBookingId, Customer customer, String fromLocation, String toLocation,
			LocalDate fromDateTime, LocalDate toDateTime, Boolean status, float distanceInKm,Driver driver) {
		super();
		this.tripBookingId = tripBookingId;
		this.customer = customer;
		this.driver = driver;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
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
	public LocalDate getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(LocalDate fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public LocalDate getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(LocalDate toDateTime) {
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
