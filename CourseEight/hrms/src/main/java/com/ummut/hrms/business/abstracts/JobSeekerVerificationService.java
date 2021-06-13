package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobSeeker;
import com.ummut.hrms.entities.concretes.User;

public interface JobSeekerVerificationService{

	boolean emailVerification(String jobSeekerEmail, boolean send);
	boolean isEmailExisting(String email, List<JobSeeker> jobSeekerList);
	boolean isTcnoExisting(String tcno, List<JobSeeker> jobSeekerList);
	boolean isAllFull(JobSeeker jobSeeker);
}
