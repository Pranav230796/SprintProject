package com.project.TaxiBookingApp.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.exception.AdminAlreadyExistException;
import com.project.TaxiBookingApp.repository.ITripBookingRepository;
import com.project.TaxiBookingApp.repository.lAdminRepository;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	private lAdminRepository RepoAdminService;
	@Autowired
	private ITripBookingRepository RepoTripService;

	@Override
	public Admin insertAdmin(Admin admin) throws AdminAlreadyExistException{
		if(RepoAdminService.existsById(admin.getId())) {
			throw new AdminAlreadyExistException();
		}
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
	public List<TripBooking> getAllTrips(int customerId) {
		List<TripBooking> list = RepoTripService.getAllTrips(customerId);
		return list;
	}

	@Override
	public List<TripBooking> getTripsCustomerWise() {
		List<TripBooking> list = RepoTripService.getTripsCustomerWise();
		return list;
	}

	@Override
	public List<TripBooking> getTripDatewise() {
		List<TripBooking> list = RepoTripService.getTripDatewise();
		return list;
	}

//	@Override
//	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) {
//		List<TripBooking> list = RepoTripService.getAllTripsForDays(customerId, fromDate, toDate);
//		return list;
//	}

}
