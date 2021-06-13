package com.ummut.hrms.business.concretes;

import java.sql.Date;
import java.util.List;

import com.ummut.hrms.business.abstracts.JobPositionVerificationService;
import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobSeeker;

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
	
	
	
	@Override
	public boolean isJobPositionActive(Date applicationDeadline) {
		boolean result=false;
		long millis=System.currentTimeMillis();  
        Date date=new Date(millis);  
        System.out.println(date);
		
        if(applicationDeadline.getTime()>date.getTime()) {
			result = true;
		}	
		
		System.out.println("isJobPositionActive result:"+ result);
		return result;
	}

}
