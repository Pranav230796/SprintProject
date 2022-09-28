package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.repository.ITripBookingRepository;
import com.project.TaxiBookingApp.repository.lAdminRepository;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	private lAdminRepository RepoAdminService;
	@Autowired
	private ITripBookingRepository RepoTripService;

	@Override
	public Admin insertAdmin(Admin admin) {
		Admin InsertedEntity = RepoAdminService.save(admin);
		return InsertedEntity;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Admin UpdatedEntity = RepoAdminService.save(admin);
		return UpdatedEntity;
	}

	@Override
	public void deleteAdmin(int adminId) {
		RepoAdminService.deleteById(adminId);
	}

	@Override
	public Optional<TripBooking> getAllTrips(int customerId) {
		Optional<TripBooking> list = RepoTripService.findById(customerId);
		return list;
	}

	@Override
	public List<TripBooking> getTripsCustomerWise() {
		List<TripBooking> list = RepoTripService.findAll();
		return list;
	}

}
