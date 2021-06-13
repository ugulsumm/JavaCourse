package com.ummut.hrms.business.abstracts;

import java.sql.Date;
import java.util.List;

import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
	DataResult<List<JobPosition>> getActiveJobPositions();
	DataResult<List<JobPosition>> getAllJobPositionSorted();
	DataResult<List<JobPosition>> getByEmployer_User_Name(String employerName);
	
	Result closeJobAdvertisement(String jobPositionName);
	
}
