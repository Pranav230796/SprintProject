package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taxi {
	
	@Id
	private int TaxiId;
	private String carType;
	private float perKmrate;
	
	public Taxi(int TaxiId, String carType, float perKmrate) {
		super();
		this.TaxiId = TaxiId;
		this.carType = carType;
		this.perKmrate = perKmrate;
	}
	public Taxi() {
		super();
	}
	public int getTaxiId() {
		return TaxiId;
	}
	public String getCarType() {
		return carType;
	}
	public float getPerKmrate() {
		return perKmrate;
	}
	public void setTaxiId(int TaxiId) {
		this.TaxiId = TaxiId;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public void setPerKmrate(float perKmrate) {
		this.perKmrate = perKmrate;
	}
	
	
	
}
