package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.exception.CustomerAlreadyExistException;
import com.project.TaxiBookingApp.exception.CustomerDoesNotExistException;

public interface  ICustomerService {
	Customer insertCustomer (Customer customer) throws CustomerAlreadyExistException;
	Customer updateCustomer (Customer customer) throws CustomerDoesNotExistException;
	void deleteCustomer(int CustomerId) throws CustomerDoesNotExistException;
	List<Customer> viewCustomers();
	List<Customer>viewCustomerById(int customerId) throws CustomerDoesNotExistException;
//	Optional<Customer> validateCustomer(String username, String password);
	
}
