package com.ummut.hrms.business.concretes;

import java.util.List;

import com.ummut.hrms.business.abstracts.JobPositionVerificationService;
import com.ummut.hrms.entities.concretes.Employer;

public abstract class  JobPositionVerificationManager implements JobPositionVerificationService{

	@Override
	public boolean isExistingEmployer(Employer employer, List<Employer> employerList) {
		boolean result=false;
		for(Employer employert: employerList) {
			if(employer.getUser().getEmail().equals(employert.getUser().getEmail())) {
				result = true;
			}
		}
		System.out.println("isExistingEmployer result:"+ result);
		return result;
	}

}
