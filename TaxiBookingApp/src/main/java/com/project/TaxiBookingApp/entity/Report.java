package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Report {
	
	@Id
	private Long id;
	
	private String content;
	
	private String licenceNo;
	
	@OneToOne
	@JoinColumn(name="custId")
	private Customer customerId;


	public Report() {
		super();
	}


	public Report(Long id, String content, String licenceNo, Customer customerId) {
		super();
		this.id = id;
		this.content = content;
		this.licenceNo = licenceNo;
		this.customerId = customerId;
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
		return licenceNo;
	}


	public void setDriverId(String licenceNo) {
		this.licenceNo = licenceNo;
	}


	public Customer getCustId() {
		return customerId;
	}


	public void setCustId(Customer custId) {
		this.customerId = custId;
	}

	
	
	
}
