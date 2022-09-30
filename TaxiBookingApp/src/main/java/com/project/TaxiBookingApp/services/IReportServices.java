package com.project.TaxiBookingApp.services;

import java.util.Optional;
import com.project.TaxiBookingApp.entity.Report;

public interface IReportServices {
	Report insertReport(Report report);
	Report updateReport(Report report);
	void deleteReport(int reportId);
	Optional<Report> viewReport(int reportId);
}
