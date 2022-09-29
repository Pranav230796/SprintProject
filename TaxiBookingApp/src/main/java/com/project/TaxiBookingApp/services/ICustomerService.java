package com.project.TaxiBookingApp.services;

import java.util.List;

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.exception.CustomerAlreadyExistException;

public interface  ICustomerService {
	Customer insertCustomer (Customer customer) throws CustomerAlreadyExistException;
	Customer updateCustomer (Customer customer);
	void deleteCustomer(int CustomerId) ;
	List<Customer> viewCustomers();
	List<Customer>viewCustomerById(int customerId);
//	Optional<Customer> validateCustomer(String username, String password);
	
}
