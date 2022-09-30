package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.TripBooking;


public interface ITripBookingService {

	TripBooking insertTripBooking(TripBooking tripBooking);
	TripBooking assignCustomer(int tripBookingId,int custId);
	TripBooking assignDriver(int tripBookingId,int driverId);
	TripBooking updateTripBooking(TripBooking tripBooking);
	void deleteTripBooking(int tripBookingId);
	List<TripBooking> viewAllTripsCustomer();
	TripBooking calculateBill();
	
}
