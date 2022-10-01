package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Admin;

@Repository
public interface lAdminRepository extends JpaRepository<Admin, Integer>{

	@Query(value = "select username from admin where username =:username",nativeQuery = true)
	public String existsByUserName(@Param("username") String username);

	@Query(value = "select password from admin where password=:password",nativeQuery=true)
	public String existsByPassword(String password);
	
}
