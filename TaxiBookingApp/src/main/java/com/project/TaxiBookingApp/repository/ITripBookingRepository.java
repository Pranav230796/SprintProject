package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.TripBooking;

@Repository
public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer> {

}
