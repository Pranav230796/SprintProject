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
	private IFeedbackServices feedbackService;
	
	@PostMapping("/feedback")
	public ResponseEntity<String> insertFeedback(@RequestBody Feedback feedback) throws FeedbackAlreadyExistException{
		Feedback entity=feedbackService.insertFeedback(feedback);
		return new ResponseEntity<String>("Thank you for the Feedback ....", HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/feedback/update")
	public ResponseEntity<String> updateFeedback(@RequestBody Feedback feedback) throws FeedbackDoesNotExistException{
		Feedback entity = feedbackService.updateFeedback(feedback);
		return new ResponseEntity<String>("Feedback updated ... ", HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/report/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable("id") int id) throws FeedbackDoesNotExistException{
		feedbackService.deleteFeedback(id);
		return new ResponseEntity<String>("Report Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/reports/{id}")
	public ResponseEntity<Optional<Feedback>> getFeedbackById(@PathVariable int id) throws FeedbackDoesNotExistException{
		Optional<Feedback> feedback=feedbackService.viewFeedback(id);
		return new ResponseEntity<Optional<Feedback>>(feedback,HttpStatus.OK);
	}
}
