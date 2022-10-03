package com.project.TaxiBookingApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String content;
	
	private String licenceNo;



	public Feedback() {
		super();
	}


	public Feedback(int id, String content, String licenceNo) {
		super();
		this.id = id;
		this.content = content;
		this.licenceNo = licenceNo;
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

	public void setId(int id) {
		this.id = id;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	
}
