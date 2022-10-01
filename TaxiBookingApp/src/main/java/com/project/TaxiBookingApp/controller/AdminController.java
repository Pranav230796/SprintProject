package com.project.TaxiBookingApp.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.entity.Login;
import com.project.TaxiBookingApp.entity.TripBooking;
import com.project.TaxiBookingApp.exception.AdminAlreadyExistException;
import com.project.TaxiBookingApp.exception.AdminDoesNotExistException;
import com.project.TaxiBookingApp.services.IAdminService;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	
	@PostMapping("/admins")
	public ResponseEntity<String> insertAdmin(@RequestBody Admin admin) throws AdminAlreadyExistException{
		Admin entity = adminService.insertAdmin(admin);
		return new ResponseEntity<String>("Admin registered successfully...",HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/admin")
	public ResponseEntity<String> updateAdmin(@RequestBody Admin admin){
		Admin entity = adminService.updateAdmin(admin);
		return new ResponseEntity<String>("Admin details updated successfully...",HttpStatus.OK);
	}
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("id") int id) throws AdminDoesNotExistException{
		adminService.deleteAdmin(id);
		return new ResponseEntity<String>("Admin account deleted successfully...",HttpStatus.OK);
	}
	
	@GetMapping("/adminTrips")
	public ResponseEntity<List<TripBooking>> getTripsCustomerWise(){
		List<TripBooking> list = adminService.getTripsCustomerWise();
		return new ResponseEntity<List<TripBooking>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/adminDatewise")
	public ResponseEntity<List<TripBooking>> getTripDatewise(){
		List<TripBooking> list = adminService.getTripDatewise();
		return new ResponseEntity<List<TripBooking>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/admin/login")
	public ResponseEntity<String> adminLogin(@RequestBody Login login){
		if(adminService.adminLogin(login)) {
			return new ResponseEntity<String>("Login Successful.....",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Login failed......",HttpStatus.CONFLICT);
	}
	
//	@GetMapping("/adminDays/{id}/{from}/{to}")
//	public ResponseEntity<List<TripBooking>> getAllTripsForDays(@PathVariable("id") int customerId,@PathVariable("from") LocalDateTime fromDate,@PathVariable("to") LocalDateTime toDate){
//		List<TripBooking> list = adminService.getAllTripsForDays(customerId, fromDate, toDate);
//		return new ResponseEntity<List<TripBooking>>(list,HttpStatus.ACCEPTED);
//	}
	
}
