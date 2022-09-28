package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Report {
	
	@Id
	private Long id;
	
	private String content;
	
	private String driverId;
	
	
	private String custId;


	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Report(Long id, String content, String driverId, String custId) {
		super();
		this.id = id;
		this.content = content;
		this.driverId = driverId;
		this.custId = custId;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getDriverId() {
		return driverId;
	}


	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}


	public String getCustId() {
		return custId;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}

	
	
	
}
