package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.core.utilities.results.SuccessDataResult;
import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobPosition;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result  add(Employer employer);
	
	Result addJobAdvertisement(Employer employer, JobPosition jobPosition);
	
}
