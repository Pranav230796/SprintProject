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
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.exception.DriverAlreadyExistException;
import com.project.TaxiBookingApp.exception.DriverDoesNotExistException;
import com.project.TaxiBookingApp.services.IDriverService;

@RestController
public class DriverController {
	
	@Autowired
	private IDriverService driverService;
	
	@PostMapping("/driver")
	public ResponseEntity<String> insertDriver(@RequestBody Driver driver) throws DriverAlreadyExistException{
		Driver entity=driverService.insertDriver(driver);
		return new ResponseEntity<String>("Driver registered successfully...",HttpStatus.OK);
	}
	
	@PostMapping("/driver/login")
	public ResponseEntity<String> driverLogin(@RequestBody Login login){
		if(driverService.driverLogin(login)) {
			return new ResponseEntity<String>("Login Successful.....",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Login failed......",HttpStatus.CONFLICT);
	}
	
	@GetMapping("/driver/{Did}/{Tid}")
	public ResponseEntity<Driver> assignTaxi(@PathVariable("Did") int driverId, @PathVariable("Tid") int cabId){
		Driver entity = driverService.assignTaxi(driverId , cabId);
		return new ResponseEntity<Driver>(entity,HttpStatus.OK);
	}
	
	@PostMapping("/driver/update")
	public ResponseEntity<String> updateDriver(@RequestBody Driver driver){
		Driver entity = driverService.updateDriver(driver);
		return new ResponseEntity<String>("Driver details updated successfully...",HttpStatus.OK);
	}
	
	@DeleteMapping("/driver/delete/{id}")
	public ResponseEntity<String> deleteDriver(@PathVariable("id") int id) throws DriverDoesNotExistException{
		driverService.deleteDriver(id);
		return new ResponseEntity<String>("Driver account deleted successfully...",HttpStatus.OK);
	}
	
	@GetMapping("/drivers/{id}")
	public ResponseEntity<Optional<Driver>> getDriverById(@PathVariable int id) throws DriverDoesNotExistException{
		Optional<Driver> driver=driverService.viewDriver(id);
		return new ResponseEntity<Optional<Driver>>(driver,HttpStatus.OK);
	}
	
	@GetMapping("/drivers/best")
	public ResponseEntity<List<Driver>> getBestDrivers(){
		List<Driver> drivers=driverService.getBestDrivers();
		return new ResponseEntity<List<Driver>>(drivers,HttpStatus.OK);
	}
	
}
