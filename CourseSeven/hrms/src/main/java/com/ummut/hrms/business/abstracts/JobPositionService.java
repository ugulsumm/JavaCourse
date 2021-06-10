package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
}
