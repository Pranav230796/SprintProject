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

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.services.CustomerService;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> insertAdmin(@RequestBody Customer customer){
		Customer entity = customerService.insertCustomer(customer);
		return new ResponseEntity<Customer>(entity,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> updateAdmin(@RequestBody Customer customer){
		Customer entity = customerService.updateCustomer(customer);
		return new ResponseEntity<Customer>(entity,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id){
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Customer Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/customers/view")
	public ResponseEntity<List<Customer>> viewCustomers(){
		List<Customer> customers=customerService.viewCustomers();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id){
		Optional<Customer> customer=customerService.viewCustomer(id);
		return new ResponseEntity<Optional<Customer>>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/customers/validate")
	public ResponseEntity<Optional<Customer>> validateCustomer(@PathVariable String username,String password){
		Optional<Customer> customer=customerService.validateCustomer(username,password);
		return new ResponseEntity<Optional<Customer>>(customer,HttpStatus.OK);
	}
}

