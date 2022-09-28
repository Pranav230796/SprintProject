package com.project.TaxiBookingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.project.TaxiBookingApp.entity.Driver;



@Repository
public interface IDriverRepository extends JpaRepository<Driver, Integer>{
	@Query("select d from Driver d where d.rating>=4.5")
	public List<Driver> findBestDrivers();
}
