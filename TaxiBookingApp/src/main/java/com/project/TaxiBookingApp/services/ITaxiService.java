package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.exception.TaxiAlreadyExistException;

public interface ITaxiService {
	
	Taxi insertTaxi(Taxi taxi) throws TaxiAlreadyExistException;
	Taxi updateTaxi(Taxi taxi);
	void deleteTaxi(int id);
	List<Taxi> viewTaxiOfType(String carType);
	int countTaxiOfType(String carType);
}
