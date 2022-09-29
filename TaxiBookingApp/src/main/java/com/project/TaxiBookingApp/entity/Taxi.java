package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taxi {
	
	@Id
	private int cabId;
	private String carType;
	private float perKmrate;
	
	public Taxi(int cabId, String carType, float perKmrate) {
		super();
		this.cabId = cabId;
		this.carType = carType;
		this.perKmrate = perKmrate;
	}
	public Taxi() {
		super();
	}
	public int getCabId() {
		return cabId;
	}
	public String getCarType() {
		return carType;
	}
	public float getPerKmrate() {
		return perKmrate;
	}
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public void setPerKmrate(float perKmrate) {
		this.perKmrate = perKmrate;
	}
	
	
	
}
