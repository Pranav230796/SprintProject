package com.project.TaxiBookingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(value = "select * from customer where id =:customerId",nativeQuery=true)
	public List<Customer> viewCustomerById(@Param("customerId") int customerId);

	@Query(value = "select username from customer where username =:username",nativeQuery = true)
	public String existsByUserName(@Param("username") String username);

	@Query(value = "select password from customer where password=:password",nativeQuery=true)
	public String existsByPassword(String password);

//	@
//	public Optional<Customer> findvalidateCustomer(String username, String password);
}
