package com.project.TaxiBookingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.repository.ITripBookingRepository;

@Service
public class TripBookingService implements ITripBookingService{

	@Autowired
	private ITripBookingRepository tripRepo;
	
	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		// TODO Auto-generated method stub
		TripBooking Result = tripRepo.save(tripBooking);
		return Result;
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		// TODO Auto-generated method stub
		TripBooking Result = tripRepo.save(tripBooking);
		return Result;
	}

	@Override
	public void deleteTripBooking(int tripBookingId) {
		// TODO Auto-generated method stub
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

}
