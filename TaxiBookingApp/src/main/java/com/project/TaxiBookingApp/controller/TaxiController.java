package com.project.TaxiBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.TaxiBookingApp.entity.Taxi;
import com.project.TaxiBookingApp.services.ITaxiService;

@RestController
public class TaxiController {
	
	@Autowired
	private ITaxiService taxiserv;
	
	@PostMapping("/taxi")
	public ResponseEntity<String> insertTaxi(@RequestBody Taxi taxi)
	{
		Taxi tax=taxiserv.insertTaxi(taxi);
		return new ResponseEntity<String>("Taxi saved successfully.",HttpStatus.OK);
	}
	
	@PostMapping("/updatetaxi")
	public ResponseEntity<String> updateTaxi(Taxi taxi){
		Taxi tax=taxiserv.updateTaxi(taxi);
		return new ResponseEntity<String>("Taxi updated successfully.",HttpStatus.OK);
	}
	
	@DeleteMapping("/deletetaxi/{id}")
	public ResponseEntity<String> deleteTaxi(@PathVariable int id){
		taxiserv.deleteTaxi(id);
		return new ResponseEntity<String>("Taxi deleted successfully.",HttpStatus.OK);
	}
	
	@GetMapping("/taxies/{name}")
	public ResponseEntity<List<Taxi>> viewTaxiOfType(@PathVariable String name)
	{
		List<Taxi> typeList=taxiserv.viewTaxiOfType(name);
		return new ResponseEntity<List<Taxi>>(typeList,HttpStatus.OK);
	}
	
	@GetMapping("/taxicount/{name}")
	public ResponseEntity<Integer> countTaxiOfType(@PathVariable String name){
		Integer count=taxiserv.countTaxiOfType(name);
		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	}
}
