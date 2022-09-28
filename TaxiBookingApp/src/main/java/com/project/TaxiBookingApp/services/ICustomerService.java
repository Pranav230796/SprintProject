package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import com.project.TaxiBookingApp.entity.Customer;

public interface  ICustomerService {
	Customer insertCustomer (Customer customer);
	Customer updateCustomer (Customer customer);
	void deleteCustomer(int CustomerId) ;
	List<Customer> viewCustomers();
	Optional<Customer>viewCustomer(int customerId);
	Optional<Customer> validateCustomer(String username, String password);
	
}
