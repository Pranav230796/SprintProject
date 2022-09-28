package com.project.TaxiBookingApp.services;

import com.project.TaxiBookingApp.entity.Admin;

public interface IAdminService {

	Admin insertAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	void deleteAdmin(int adminId);
}
