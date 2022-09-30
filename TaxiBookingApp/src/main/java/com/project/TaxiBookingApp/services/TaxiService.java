package com.project.TaxiBookingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.exception.TaxiAlreadyExistException;
import com.project.TaxiBookingApp.repository.ITaxiRepository;

@Service
public class TaxiService implements ITaxiService{
	
	@Autowired
	private ITaxiRepository reposerv;
	
	@Override
	public Taxi insertTaxi(Taxi taxi) throws TaxiAlreadyExistException{
		if(reposerv.existsById(taxi.getTaxiId())) {
			throw new TaxiAlreadyExistException();
		}
		Taxi insertedEntity=reposerv.save(taxi);
		return insertedEntity;
	}
	
	@Override
	public Taxi updateTaxi(Taxi taxi) {
		Taxi updatedEntity=reposerv.save(taxi);
		return updatedEntity;
	}
	
	@Override
	public void deleteTaxi(int id) {
		reposerv.deleteById(id);
	}
	
	@Override
	public List<Taxi> viewTaxiOfType(String carType) {
		List<Taxi> taxiOfType=reposerv.findCarType(carType);
		return taxiOfType;
	}
	
	@Override
	public int countTaxiOfType(String carType) {
		int total=reposerv.countCarType(carType);
		return total;
	}
	
	
}
