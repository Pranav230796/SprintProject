package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Taxi;

public interface ITaxiService {
	
	Taxi insertTaxi(Taxi taxi);
	Taxi updateTaxi(Taxi taxi);
	void deleteTaxi(int id);
	List<Taxi> viewTaxiOfType(String carType);
	int countTaxiOfType(String carType);
}
