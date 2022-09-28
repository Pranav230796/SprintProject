package com.project.TaxiBookingApp.services;

import com.project.TaxiBookingApp.entity.Customer;

public interface  ICustomerService {
	Customer insertCustomer (Customer customer);
	Customer updateCustomer (Customer customer);
	void deleteCustomer(int CustomerId) ;
	
}
