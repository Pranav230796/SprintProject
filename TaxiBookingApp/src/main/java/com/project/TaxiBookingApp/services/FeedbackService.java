package com.project.TaxiBookingApp.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Feedback;
import com.project.TaxiBookingApp.exception.FeedbackAlreadyExistException;
import com.project.TaxiBookingApp.exception.FeedbackDoesNotExistException;
import com.project.TaxiBookingApp.repository.IFeedbackRepository;

@Service
public class FeedbackService implements IFeedbackServices {

	@Autowired
	private IFeedbackRepository RepoServ;

	@Override
	public Feedback insertReport(Feedback report) throws FeedbackAlreadyExistException{
		if(RepoServ.existsById(report.getId())) {
			throw new FeedbackAlreadyExistException();
		}
		Feedback insertedEntity=RepoServ.save(report);
		return insertedEntity;

	}

	@Override
	public Feedback updateReport(Feedback report) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(report.getId())) {
			throw new FeedbackDoesNotExistException();
		}
		Feedback updatedEntity=RepoServ.save(report);
		return updatedEntity;

	}

	@Override
	public void deleteReport(int reportId) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(reportId)) {
			throw new FeedbackDoesNotExistException();
		}
		RepoServ.deleteById(reportId);
	}

	@Override
	public Optional<Feedback> viewReport(int reportId) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(reportId)) {
			throw new FeedbackDoesNotExistException();
		}
		Optional<Feedback> getEntity=RepoServ.findById(reportId);
		return getEntity;

	}

}
