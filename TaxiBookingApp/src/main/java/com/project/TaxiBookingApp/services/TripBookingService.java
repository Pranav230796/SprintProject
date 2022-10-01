package com.project.TaxiBookingApp.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.entity.Driver;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.repository.ICustomerRepository;
import com.project.TaxiBookingApp.repository.IDriverRepository;
import com.project.TaxiBookingApp.repository.ITripBookingRepository;

@Service
public class TripBookingService implements ITripBookingService{

	@Autowired
	private ITripBookingRepository tripRepo;
	@Autowired
	private IDriverRepository driverRepo;
	@Autowired
	private ICustomerRepository custRepo;
	
	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking){
		TripBooking Result = tripRepo.save(tripBooking);
		return Result;
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		TripBooking Result = tripRepo.save(tripBooking);
		return Result;
	}

	@Override
	public void deleteTripBooking(int tripBookingId) {
		tripRepo.deleteById(tripBookingId);
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public TripBooking calculateBill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBooking assignDriver(int tripBookingId, int driverId) {
		Driver driver = driverRepo.findById(driverId).get();
		TripBooking trip = tripRepo.findById(tripBookingId).get();
		trip.setDriver(driver);
		return tripRepo.save(trip);
	}

	@Override
	public TripBooking assignCustomer(int tripBookingId, int custId) {
		Customer customer = custRepo.findById(custId).get();
		TripBooking trip = tripRepo.findById(tripBookingId).get();
		trip.setCustomer(customer);
		return tripRepo.save(trip);
	}

}
