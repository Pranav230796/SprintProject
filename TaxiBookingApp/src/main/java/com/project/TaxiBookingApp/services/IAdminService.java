package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.TripBooking;

public interface IAdminService {

	Admin insertAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	void deleteAdmin(int adminId);
	Optional<TripBooking> getAllTrips(int customerId);
	List<TripBooking> getTripsCustomerWise();
}
