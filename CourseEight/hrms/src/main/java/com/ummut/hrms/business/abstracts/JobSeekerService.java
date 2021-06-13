package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	Result add(JobSeeker jobSeeker);
	DataResult <List<JobSeeker>> getAll();
	
	
}
