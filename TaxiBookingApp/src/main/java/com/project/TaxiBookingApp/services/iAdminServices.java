package com.project.TaxiBookingApp.services;

import com.project.TaxiBookingApp.entity.Admin;

public interface iAdminServices {

	Admin insertAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	void deleteAdmin(int adminId);
}
