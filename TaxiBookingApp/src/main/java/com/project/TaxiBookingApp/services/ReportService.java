package com.project.TaxiBookingApp.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Report;
import com.project.TaxiBookingApp.exception.ReportAlreadyExistException;
import com.project.TaxiBookingApp.exception.ReportDoesNotExistException;
import com.project.TaxiBookingApp.repository.IReportRepository;

@Service
public class ReportService implements IReportServices {

	@Autowired
	private IReportRepository RepoServ;

	@Override
	public Report insertReport(Report report) throws ReportAlreadyExistException{
		if(RepoServ.existsById(report.getId())) {
			throw new ReportAlreadyExistException();
		}
		Report insertedEntity=RepoServ.save(report);
		return insertedEntity;

	}

	@Override
	public Report updateReport(Report report) throws ReportDoesNotExistException{
		if(!RepoServ.existsById(report.getId())) {
			throw new ReportDoesNotExistException();
		}
		Report updatedEntity=RepoServ.save(report);
		return updatedEntity;

	}

	@Override
	public void deleteReport(int reportId) throws ReportDoesNotExistException{
		if(!RepoServ.existsById(reportId)) {
			throw new ReportDoesNotExistException();
		}
		RepoServ.deleteById(reportId);
	}

	@Override
	public Optional<Report> viewReport(int reportId) throws ReportDoesNotExistException{
		if(!RepoServ.existsById(reportId)) {
			throw new ReportDoesNotExistException();
		}
		Optional<Report> getEntity=RepoServ.findById(reportId);
		return getEntity;

	}

}
