package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
