package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Driver;
import com.project.TaxiBookingApp.repository.IDriverRepository;


@Service
public class DriverService implements IDriverService{

	@Autowired
	private IDriverRepository RepoServ;
	@Override
	public Driver insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		Driver insertedEntity=RepoServ.save(driver);
		return insertedEntity;
	}
	@Override
	public Driver updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		Driver updatedEntity=RepoServ.save(driver);
		return updatedEntity;
	}
	@Override
	public void deleteDriver(int driverId) {
		// TODO Auto-generated method stub
		RepoServ.deleteById(driverId);
	}
	@Override
	public Optional<Driver> viewDriver(int driverId) {
		// TODO Auto-generated method stub
		Optional<Driver> getEntity=RepoServ.findById(driverId);
		return getEntity;
	}
	@Override
	public List<Driver> getBestDrivers() {
		// TODO Auto-generated method stub
		List<Driver> drivers=RepoServ.findBestDrivers();
		return drivers;
	}
	
	
}
