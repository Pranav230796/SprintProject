package com.project.TaxiBookingApp.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Report;
import com.project.TaxiBookingApp.repository.IReportRepository;

@Service
public class ReportService implements IReportServices {

	@Autowired
	private IReportRepository RepoServ;

	@Override
	public Report insertReport(Report report) {
		Report insertedEntity=RepoServ.save(report);
		return insertedEntity;

	}

	@Override
	public Report updateReport(Report report) {
		Report updatedEntity=RepoServ.save(report);
		return updatedEntity;

	}

	@Override
	public void deleteReport(int reportId) {
		RepoServ.deleteById(reportId);
	}

	@Override
	public Optional<Report> viewReport(int reportId) {
		Optional<Report> getEntity=RepoServ.findById(reportId);
		return getEntity;

	}

}
