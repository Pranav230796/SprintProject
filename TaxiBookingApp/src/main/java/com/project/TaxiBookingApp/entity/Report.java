package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;


import javax.persistence.Id;

@Entity

public class Report {
	
	@Id
	private int id;
	
	private String content;
	
	private String licenceNo;



	public Report() {
		super();
	}


	public Report(int id, String content, String licenceNo) {
		super();
		this.id = id;
		this.content = content;
		this.licenceNo = licenceNo;
		//this.customerId = customerId;
	}


	public int getId() {
		return id;
	}


	public String getContent() {
		return content;
	}


	public String getLicenceNo() {
		return licenceNo;
	}


//	public int getCustomerId() {
//		return customerId;
//	}


	public void setId(int id) {
		this.id = id;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}

	
}
