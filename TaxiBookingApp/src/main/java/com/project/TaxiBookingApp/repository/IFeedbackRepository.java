package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Feedback;


@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {


}
