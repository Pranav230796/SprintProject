package com.project.TaxiBookingApp.repository;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.TripBooking;

@Repository
public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer> {

	@Query(value="select * from trip_booking where customer_id =:Id",nativeQuery = true)
	public List<TripBooking> getAllTrips(@Param("Id") int customerId);
	
	@Query(value="select * from trip_booking order by customer_Id desc",nativeQuery = true)
	public List<TripBooking> getTripsCustomerWise();
	
	@Query(value="select * from trip_booking order by from_date_time",nativeQuery = true)
	public List<TripBooking> getTripDatewise();
	
//	@Query(value="select * from trip_booking where customer_id =:customerId and from_date_time =:fromDate and to_date_time =:toDate",nativeQuery = true)
//	public List<TripBooking> getAllTripsForDays(@Param("customerId") int customerId,@Param("fromDate") LocalDateTime fromDate, @Param("toDate") LocalDateTime toDate);
}
