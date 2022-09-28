package com.project.TaxiBookingApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.TaxiBookingApp.entity.Admin;
import com.project.TaxiBookingApp.repository.lAdminRepository;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	private lAdminRepository RepoService;

	@Override
	public Admin insertAdmin(Admin admin) {
		Admin InsertedEntity = RepoService.save(admin);
		return InsertedEntity;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Admin UpdatedEntity = RepoService.save(admin);
		return UpdatedEntity;
	}

	@Override
	public void deleteAdmin(int adminId) {
		RepoService.deleteById(adminId);
	}

}
