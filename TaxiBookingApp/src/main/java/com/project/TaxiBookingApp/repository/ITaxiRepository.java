package com.project.TaxiBookingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.project.TaxiBookingApp.entity.Taxi;
@Repository
public interface ITaxiRepository extends JpaRepository<Taxi, Integer>{
	
	@Query("select t from Taxi t where t.carType=:name")
	public List<Taxi> findCarType(@Param("name") String name);
	
	@Query("select count(*) from Taxi t where t.carType=:name")
	public int countCarType(@Param("name") String name);
}
