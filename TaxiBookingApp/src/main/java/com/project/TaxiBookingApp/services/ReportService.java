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
		// TODO Auto-generated method stub
		Report insertedEntity=RepoServ.save(report);
		return insertedEntity;

	}

	@Override
	public Report updateReport(Report report) {
		// TODO Auto-generated method stub
		Report updatedEntity=RepoServ.save(report);
		return updatedEntity;

	}

	@Override
	public void deleteReport(long reportId) {
		// TODO Auto-generated method stub
		RepoServ.deleteById(reportId);
	}

	@Override
	public Optional<Report> viewReport(long reportId) {
		// TODO Auto-generated method stub
		Optional<Report> getEntity=RepoServ.findById(reportId);
		return getEntity;

	}

}
