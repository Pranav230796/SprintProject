package com.project.TaxiBookingApp.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.TaxiBookingApp.entity.Feedback;
import com.project.TaxiBookingApp.exception.FeedbackAlreadyExistException;
import com.project.TaxiBookingApp.exception.FeedbackDoesNotExistException;
import com.project.TaxiBookingApp.services.IFeedbackServices;

@RestController
public class FeedbackController {
	
	@Autowired
	private IFeedbackServices reportService;
	
	@PostMapping("/report")
	public String insertReport(@RequestBody Feedback report) throws FeedbackAlreadyExistException{
		Feedback entity=reportService.insertReport(report);
		return "Report added successfully";
	}
	
	@PostMapping("/updateReport")
	public String updateReport(@RequestBody Feedback report) throws FeedbackDoesNotExistException{
		Feedback entity = reportService.updateReport(report);
		return "Report updated succesfully";
	}
	
	@DeleteMapping("/delete/report/{id}")
	public ResponseEntity<String> deleteReport(@PathVariable("id") int id) throws FeedbackDoesNotExistException{
		reportService.deleteReport(id);
		return new ResponseEntity<String>("Report Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/reports/{id}")
	public ResponseEntity<Optional<Feedback>> getReportById(@PathVariable int id) throws FeedbackDoesNotExistException{
		Optional<Feedback> report=reportService.viewReport(id);
		return new ResponseEntity<Optional<Feedback>>(report,HttpStatus.OK);
	}
}
