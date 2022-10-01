package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.exception.AdminAlreadyExistException;
import com.project.TaxiBookingApp.exception.AdminDoesNotExistException;

public interface IAdminService {

	Admin insertAdmin(Admin admin) throws AdminAlreadyExistException;
	Admin updateAdmin(Admin admin);
	void deleteAdmin(int adminId) throws AdminDoesNotExistException;
	List<TripBooking> getAllTrips(int customerId);
	List<TripBooking> getTripsCustomerWise();
	List<TripBooking> getTripDatewise();
	boolean adminLogin(Login login);
}
