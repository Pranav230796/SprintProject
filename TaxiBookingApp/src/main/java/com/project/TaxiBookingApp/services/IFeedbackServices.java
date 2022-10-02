package com.project.TaxiBookingApp.services;

import java.util.Optional;
import com.project.TaxiBookingApp.entity.Feedback;
import com.project.TaxiBookingApp.exception.FeedbackAlreadyExistException;
import com.project.TaxiBookingApp.exception.FeedbackDoesNotExistException;

public interface IFeedbackServices {
	Feedback insertReport(Feedback report) throws FeedbackAlreadyExistException;
	Feedback updateReport(Feedback report) throws FeedbackDoesNotExistException;
	void deleteReport(int reportId) throws FeedbackDoesNotExistException;
	Optional<Feedback> viewReport(int reportId) throws FeedbackDoesNotExistException;
}
