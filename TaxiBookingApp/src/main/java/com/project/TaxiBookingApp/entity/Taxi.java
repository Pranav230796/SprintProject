package com.project.TaxiBookingApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",updatable = false, nullable = false)
	private int TaxiId;
	private String carType;
	private float perKmrate;
	

	
	public Taxi(int taxiId, String carType, float perKmrate) {
		super();
		TaxiId = taxiId;
		this.carType = carType;
		this.perKmrate = perKmrate;
	}

	public Taxi() {
		super();
	}
	
	public String getCarType() {
		return carType;
	}
	
	public float getPerKmrate() {
		return perKmrate;
	}
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public void setPerKmrate(float perKmrate) {
		this.perKmrate = perKmrate;
	}

	public int getTaxiId() {
		return TaxiId;
	}

	public void setTaxiId(int taxiId) {
		TaxiId = taxiId;
	}
	
	
	
}
