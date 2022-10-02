package com.project.TaxiBookingApp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer extends User{
	
	@Id
	private int id;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id", referencedColumnName = "id")
	private List<Feedback> feedback;
	
	
	public Customer() {
		super();
	}


	public Customer(String username, String password, String phoneNo, String emailId, String address, int id, List<Feedback> feedback) {
		super(username, password, phoneNo, emailId, address);
		this.id = id;
		this.feedback = feedback;
	}


	public int getId() {
		return id;
	}


	public List<Feedback> getFeedback() {
		return feedback;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}


}

