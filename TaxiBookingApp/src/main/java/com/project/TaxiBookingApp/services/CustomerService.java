package com.project.TaxiBookingApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.repository.ICustomerRepository;


@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepository RepoService;

	@Override
	public Customer insertCustomer(Customer customer) {
		Customer InsertedEntity = RepoService.save(customer);
		return InsertedEntity;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer UpdatedEntity = RepoService.save(customer);
		return UpdatedEntity;
	}

	@Override
	public void deleteCustomer(int CustomerId) {
		RepoService.deleteById(CustomerId);
	}
	
	@Override
	public List<Customer> viewCustomers() {
		List<Customer> customers=RepoService.findviewCustomers();
		return customers;
	}
	@Override
	public Optional<Customer> viewCustomer(int customerId) {
		Optional<Customer> getEntity=RepoService.findById(customerId);
		return getEntity;
	}
	@Override
	public Optional<Customer> validateCustomer(String username, String password) {
		Optional<Customer> validateEntity=RepoService.findvalidateCustomer(username,password);
		return validateEntity;
	}

}

