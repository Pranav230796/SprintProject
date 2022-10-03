package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Driver;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.exception.DriverAlreadyExistException;
import com.project.TaxiBookingApp.exception.DriverDoesNotExistException;
import com.project.TaxiBookingApp.repository.IDriverRepository;
import com.project.TaxiBookingApp.repository.ITaxiRepository;
import com.project.TaxiBookingApp.repository.ITripBookingRepository;


@Service
public class DriverService implements IDriverService{

	@Autowired
	private IDriverRepository RepoServ;
	@Autowired
	private ITaxiRepository RepoTaxiServ;
	@Autowired 
	private ITripBookingRepository RepoTripServ;
	
	@Override
	public Driver insertDriver(Driver driver) throws DriverAlreadyExistException{
		if(RepoServ.existsById(driver.getDriverId())) {
			throw new DriverAlreadyExistException();
		}
		Driver insertedEntity=RepoServ.save(driver);
		return insertedEntity;
	}
	
	@Override
	public Driver updateDriver(Driver driver) {
		if(RepoTripServ.existsById(driver.getDriverId())) {
			RepoTripServ.deleteById(driver.getDriverId());
		}
		Driver updatedEntity=RepoServ.save(driver);
		return updatedEntity;
	}
	@Override
	public void deleteDriver(int driverId) throws DriverDoesNotExistException{
		if(!RepoServ.existsById(driverId)) {
			throw new DriverDoesNotExistException();
		}
		if(RepoTripServ.existsById(driverId)) {
			RepoTripServ.deleteById(driverId);
		}
		RepoServ.deleteById(driverId);
	}
	
	@Override
	public Optional<Driver> viewDriver(int driverId) throws DriverDoesNotExistException{
		if(!RepoServ.existsById(driverId)) {
			throw new DriverDoesNotExistException();
		}
		Optional<Driver> getEntity=RepoServ.findById(driverId);
		return getEntity;
	}
	
	@Override
	public List<Driver> getBestDrivers() {
		List<Driver> drivers=RepoServ.findBestDrivers();
		return drivers;
	}

	@Override
	public Driver assignTaxi(int driverId,int cabId) {
		Taxi taxi = RepoTaxiServ.findById(cabId).get();
		Driver driver = RepoServ.findById(driverId).get();
		driver.setTaxi(taxi);
		return RepoServ.save(driver);
	}
	
	public boolean driverLogin(Login login) {
		String username = RepoServ.existsByUserName(login.getUsername());
		String password = RepoServ.existsByPassword(login.getPassword());
		if(username == null || password == null) {
			return false;
		}
		return true;
	}
	
	
}
