package com.project.TaxiBookingApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.project.TaxiBookingApp.entity.Driver;
import com.project.TaxiBookingApp.services.iDriverServices;

@RestController
public class DriverController {
	
	@Autowired
	private iDriverServices driverService;
	
	@PostMapping("/driver")
	public String insertDriver(@RequestBody Driver driver)
	{
		Driver entity=driverService.insertDriver(driver);
		return "Driver saved successfully";
	}
	
	@PostMapping("/updateDriver")
	public String updateDriver(@RequestBody Driver driver){
		Driver entity = driverService.updateDriver(driver);
		return "Driver details updated succesfully";
	}
	
	@DeleteMapping("/delete/driver/{id}")
	public ResponseEntity<String> deleteDriver(@PathVariable("id") int id){
		driverService.deleteDriver(id);
		return new ResponseEntity<String>("Driver Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/drivers/{id}")
	public ResponseEntity<Optional<Driver>> getDriverById(@PathVariable int id)
	{
		Optional<Driver> driver=driverService.viewDriver(id);
		return new ResponseEntity<Optional<Driver>>(driver,HttpStatus.OK);
	}
	
	@GetMapping("/drivers/best")
	public ResponseEntity<List<Driver>> getBestDrivers()
	{
		List<Driver> drivers=driverService.getBestDrivers();
		return new ResponseEntity<List<Driver>>(drivers,HttpStatus.OK);
	}
	
}