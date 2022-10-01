package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.exception.TaxiAlreadyExistException;
import com.project.TaxiBookingApp.exception.TaxiDoesNotExistException;

public interface ITaxiService {
	
	Taxi insertTaxi(Taxi taxi) throws TaxiAlreadyExistException;
	Taxi updateTaxi(Taxi taxi) throws TaxiDoesNotExistException;
	void deleteTaxi(int id) throws TaxiDoesNotExistException;
	List<Taxi> viewTaxiOfType(String carType);
	int countTaxiOfType(String carType);
}
