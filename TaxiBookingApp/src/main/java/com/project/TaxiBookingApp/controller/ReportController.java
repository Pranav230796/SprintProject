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


import com.project.TaxiBookingApp.entity.Report;
import com.project.TaxiBookingApp.services.IReportServices;

@RestController
public class ReportController {
	
	@Autowired
	private IReportServices reportService;
	
	@PostMapping("/report")
	public String insertReport(@RequestBody Report report){
		Report entity=reportService.insertReport(report);
		return "Report added successfully";
	}
	
	@PostMapping("/updateReport")
	public String updateReport(@RequestBody Report report){
		Report entity = reportService.updateReport(report);
		return "Report updated succesfully";
	}
	
	@DeleteMapping("/delete/report/{id}")
	public ResponseEntity<String> deleteReport(@PathVariable("id") int id){
		reportService.deleteReport(id);
		return new ResponseEntity<String>("Report Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/reports/{id}")
	public ResponseEntity<Optional<Report>> getReportById(@PathVariable int id)
	{
		Optional<Report> report=reportService.viewReport(id);
		return new ResponseEntity<Optional<Report>>(report,HttpStatus.OK);
	}
}
