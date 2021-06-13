package com.ummut.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.JobSeekerVerificationService;
import com.ummut.hrms.business.abstracts.MernisCheckService;
import com.ummut.hrms.core.utilities.results.ErrorResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobSeeker;

import com.ummut.hrms.entities.concretes.User;
import com.ummut.hrms.core.utilities.results.SuccessResult;

@Service
public abstract class JobSeekerVerificationManager implements JobSeekerVerificationService{///abstract???
	

	
	
	@Override
	public boolean isTcnoExisting(String tcno, List<JobSeeker> jobSeekerList) {
		boolean result=true;
		for(JobSeeker jobSeeker: jobSeekerList) {
			if(tcno.equals(jobSeeker.getTcno())) {
				result = false;
			}
		}
		System.out.println("isTcnoExisting result:"+ result);
		return result;
	}
	
	
	@Override
	public boolean emailVerification(String jobSeekerEmail, boolean send) {
		System.out.println("Verification email sent to " + jobSeekerEmail+ " .");
		return send;
	}
	
	
	@Override
	public boolean isAllFull(JobSeeker jobSeeker) {
		boolean result=false;
		if(jobSeeker.getUser().getName()!=null&&jobSeeker.getLastName()!=null&&jobSeeker.getUser().getEmail()!=null&&jobSeeker.getTcno()!=null&&jobSeeker.getBirthYear()!=0&&jobSeeker.getUser().getPassword()!=null&&jobSeeker.getUser().getRepeatPassword()!=null) {
			result = true;
		}
		System.out.println("isAllFull result: "+ result);
		return result;
	}

	@Override
	public boolean isEmailExisting(String email, List<JobSeeker> jobSeekerList) {
		boolean result=true;
		for(JobSeeker jobSeeker: jobSeekerList) {
			if(email.equals(jobSeeker.getUser().getEmail())) {
				result = false;
			}
		}
		System.out.println("isEmailExisting result:"+ result);
		return  result;
	}
	
	

}
