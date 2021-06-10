package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.entities.concretes.Employer;

public interface JobPositionVerificationService {
	boolean isExistingEmployer(Employer employer, List<Employer> employerList);
}
