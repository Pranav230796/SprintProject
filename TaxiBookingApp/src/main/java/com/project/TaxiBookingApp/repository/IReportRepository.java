package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Report;


@Repository
public interface IReportRepository extends JpaRepository<Report, Long> {

}
