package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;


import com.project.TaxiBookingApp.entity.Driver;

public interface IDriverService {
	
	Driver insertDriver(Driver driver);
	Driver updateDriver(Driver driver);
	void deleteDriver(int driverId);
	Optional<Driver> viewDriver(int driverId);
	
	List<Driver> getBestDrivers();
}
