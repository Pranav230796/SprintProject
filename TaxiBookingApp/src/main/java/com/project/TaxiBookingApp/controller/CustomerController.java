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

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.exception.CustomerAlreadyExistException;
import com.project.TaxiBookingApp.exception.CustomerDoesNotExistException;
import com.project.TaxiBookingApp.services.CustomerService;
import com.project.TaxiBookingApp.services.TripBookingService;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private TripBookingService tripService;
	
	@PostMapping("/customer/login")
	public ResponseEntity<String> customerLogin(@RequestBody Login login){
		if(customerService.customerLogin(login)) {
			return new ResponseEntity<String>("Login Successful...",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Login Failed...",HttpStatus.CONFLICT);
	}
	
	@PostMapping("/customers")
	public ResponseEntity<String> insertCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistException{
		Customer entity = customerService.insertCustomer(customer);
		return new ResponseEntity<String>("Customer registered successfully...",HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) throws CustomerDoesNotExistException{
		Customer entity = customerService.updateCustomer(customer);
		return new ResponseEntity<String>("Customer details updated successfully...",HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id) throws CustomerDoesNotExistException{
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Customer account deleted successfully...",HttpStatus.OK);
	}
	
	@GetMapping("/customers/view")
	public ResponseEntity<List<Customer>> viewCustomers(){
		List<Customer> customers=customerService.viewCustomers();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<List<Customer>> getCustomerById(@PathVariable int id) throws CustomerDoesNotExistException{
		List<Customer> customer=customerService.viewCustomerById(id);
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	}
	
	@PostMapping("/tripbooking")
	public ResponseEntity<TripBooking> insertTripBooking(@RequestBody TripBooking trip) {
		TripBooking entity = tripService.insertTripBooking(trip);
		return new ResponseEntity<TripBooking>(entity,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/tripbooking/{Tid}/{Did}")
	public ResponseEntity<TripBooking> assignDriver(@PathVariable("Tid") int tripBookingId, @PathVariable("Did") int driverId){
		TripBooking entity = tripService.assignDriver(tripBookingId, driverId);
		return new ResponseEntity<TripBooking>(entity,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/tripbookings/{tid}/{cid}")
	public ResponseEntity<TripBooking> assignCustomer(@PathVariable("tid") int tripBookingId, @PathVariable("cid") int custId){
		TripBooking entity = tripService.assignCustomer(tripBookingId, custId);
		return new ResponseEntity<TripBooking>(entity,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/tripbooking/view/{id}")
	public ResponseEntity<TripBooking> viewAllTripsCustomer(@PathVariable("id") int tripBookingId){
		TripBooking entity = tripService.viewAllTripsCustomer(tripBookingId);
		return new ResponseEntity<TripBooking>(entity,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/tripbooking/bill/{id}")
	public ResponseEntity<Float> calculateBill(@PathVariable("id") int tripBookingId){
		Float entity = tripService.calculateBill(tripBookingId);
		return new ResponseEntity<Float>(entity,HttpStatus.ACCEPTED);
	}
	
}

