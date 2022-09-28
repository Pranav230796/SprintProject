package com.project.TaxiBookingApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> findviewCustomers();

	public Optional<Customer> findvalidateCustomer();

	public Optional<Customer> findvalidateCustomer(String username, String password);
}
