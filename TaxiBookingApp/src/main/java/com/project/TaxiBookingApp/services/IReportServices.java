package com.project.TaxiBookingApp.services;

import java.util.Optional;
import com.project.TaxiBookingApp.entity.Report;
import com.project.TaxiBookingApp.exception.ReportAlreadyExistException;
import com.project.TaxiBookingApp.exception.ReportDoesNotExistException;

public interface IReportServices {
	Report insertReport(Report report) throws ReportAlreadyExistException;
	Report updateReport(Report report) throws ReportDoesNotExistException;
	void deleteReport(int reportId) throws ReportDoesNotExistException;
	Optional<Report> viewReport(int reportId) throws ReportDoesNotExistException;
}
