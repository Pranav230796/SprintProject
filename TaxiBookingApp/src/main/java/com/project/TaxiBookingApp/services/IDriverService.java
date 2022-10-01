package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;


import com.project.TaxiBookingApp.entity.Driver;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.exception.DriverAlreadyExistException;
import com.project.TaxiBookingApp.exception.DriverDoesNotExistException;

public interface IDriverService {
	
	Driver insertDriver(Driver driver) throws DriverAlreadyExistException;
	Driver assignTaxi(int driverId,int cabId);
	Driver updateDriver(Driver driver);
	void deleteDriver(int driverId) throws DriverDoesNotExistException;
	Optional<Driver> viewDriver(int driverId) throws DriverDoesNotExistException;
	List<Driver> getBestDrivers();
	boolean driverLogin(Login login);
}
