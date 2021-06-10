package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.entities.concretes.Employer;

public interface EmployerVerificationService {
	boolean emailVerification(String employerEmail, boolean send);
	boolean isAllFull(Employer employer);
	boolean isEmailExisting(String email, List<Employer> employerList);
	
	boolean doesHrmsStaffGiveConfirmation(int confirmation);
	
	

}
