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
	public Feedback insertFeedback(Feedback feedback) throws FeedbackAlreadyExistException{
		if(RepoServ.existsById(feedback.getId())) {
			throw new FeedbackAlreadyExistException();
		}
		Feedback insertedEntity=RepoServ.save(feedback);
		return insertedEntity;

	}

	@Override
	public Feedback updateFeedback(Feedback feedback) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(feedback.getId())) {
			throw new FeedbackDoesNotExistException();
		}
		Feedback updatedEntity=RepoServ.save(feedback);
		return updatedEntity;

	}

	@Override
	public void deleteFeedback(int feedbackId) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(feedbackId)) {
			throw new FeedbackDoesNotExistException();
		}
		RepoServ.deleteById(feedbackId);
	}

	@Override
	public Optional<Feedback> viewFeedback(int feedbacktId) throws FeedbackDoesNotExistException{
		if(!RepoServ.existsById(feedbacktId)) {
			throw new FeedbackDoesNotExistException();
		}
		Optional<Feedback> getEntity=RepoServ.findById(feedbacktId);
		return getEntity;

	}

}
