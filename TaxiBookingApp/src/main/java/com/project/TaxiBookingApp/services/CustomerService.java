package com.project.TaxiBookingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Customer;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.exception.CustomerAlreadyExistException;
import com.project.TaxiBookingApp.exception.CustomerDoesNotExistException;
import com.project.TaxiBookingApp.repository.ICustomerRepository;


@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepository RepoService;

	@Override
	public Customer insertCustomer(Customer customer) throws CustomerAlreadyExistException{
		if(RepoService.existsById(customer.getId())) {
			throw new CustomerAlreadyExistException();
		}
		Customer InsertedEntity = RepoService.save(customer);
		return InsertedEntity;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerDoesNotExistException{
		if(!RepoService.existsById(customer.getId())) {
			throw new CustomerDoesNotExistException();
		}
		Customer UpdatedEntity = RepoService.save(customer);
		return UpdatedEntity;
	}

	@Override
	public void deleteCustomer(int CustomerId) throws CustomerDoesNotExistException{
		if(!RepoService.existsById(CustomerId)) {
			throw new CustomerDoesNotExistException();
		}
		RepoService.deleteById(CustomerId);
	}
	
	@Override
	public List<Customer> viewCustomers() {
		List<Customer> customers=RepoService.findAll();
		return customers;
	}
	@Override
	public List<Customer> viewCustomerById(int customerId) throws CustomerDoesNotExistException{
		if(!RepoService.existsById(customerId)) {
			throw new CustomerDoesNotExistException();
		}
		List<Customer> getEntity = RepoService.viewCustomerById(customerId);
		return getEntity;
	}
//	@Override
//	public Optional<Customer> validateCustomer(String username, String password) {
//		Optional<Customer> validateEntity=RepoService.findvalidateCustomer(username,password);
//		return validateEntity;
//	}

	public boolean customerLogin(Login login) {
		String username = RepoService.existsByUserName(login.getUsername());
		String password = RepoService.existsByPassword(login.getPassword());
		if(username == null || password == null) {
			return false;
		}
		return true;
	}

}

