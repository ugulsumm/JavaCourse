package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobSeeker;

public interface EmployerVerificationService {
	boolean emailVerification(String employerEmail, boolean send);
	boolean isAllFull(Employer employer);
	boolean isEmailExisting(String email, List<Employer> employerList);
	
	boolean doesHrmsStaffGiveConfirmation(int confirmation);
	
	

}
