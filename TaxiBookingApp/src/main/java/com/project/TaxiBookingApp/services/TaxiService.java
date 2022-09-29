package com.project.TaxiBookingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.repository.ITaxiRepository;

@Service
public class TaxiService implements ITaxiService{
	
	@Autowired
	private ITaxiRepository reposerv;
	@Override
	public Taxi insertTaxi(Taxi taxi) {
		// TODO Auto-generated method stub
		Taxi insertedEntity=reposerv.save(taxi);
		return insertedEntity;
	}
	@Override
	public Taxi updateTaxi(Taxi taxi) {
		// TODO Auto-generated method stub
		Taxi updatedEntity=reposerv.save(taxi);
		return updatedEntity;
	}
	
	@Override
	public void deleteTaxi(int id) {
		// TODO Auto-generated method stub
		reposerv.deleteById(id);
	}
	@Override
	public List<Taxi> viewTaxiOfType(String carType) {
		// TODO Auto-generated method stub
		List<Taxi> taxiOfType=reposerv.findCarType(carType);
		return taxiOfType;
	}
	@Override
	public int countTaxiOfType(String carType) {
		// TODO Auto-generated method stub
		int total=reposerv.countCarType(carType);
		return total;
	}
	
	
}
