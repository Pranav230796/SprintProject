package com.project.TaxiBookingApp.services;

import java.util.Optional;
import com.project.TaxiBookingApp.entity.Feedback;
import com.project.TaxiBookingApp.exception.FeedbackAlreadyExistException;
import com.project.TaxiBookingApp.exception.FeedbackDoesNotExistException;

public interface IFeedbackServices {
	Feedback insertFeedback(Feedback report) throws FeedbackAlreadyExistException;
	Feedback updateFeedback(Feedback report) throws FeedbackDoesNotExistException;
	void deleteFeedback(int reportId) throws FeedbackDoesNotExistException;
	Optional<Feedback> viewFeedback(int reportId) throws FeedbackDoesNotExistException;
}
