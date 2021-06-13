package com.ummut.hrms.business.concretes;


import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobPosition;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.EmployerService;
import com.ummut.hrms.business.abstracts.JobPositionService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.ErrorResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.core.utilities.results.SuccessDataResult;
import com.ummut.hrms.core.utilities.results.SuccessResult;
import com.ummut.hrms.dataAccess.abstracts.EmployerDao;
import com.ummut.hrms.dataAccess.abstracts.JobPositionDao;

@Service
public class JobPositionManager extends JobPositionVerificationManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao, EmployerDao employerDao) {
		super();
		this.jobPositionDao=jobPositionDao;
		//this.employerDao=employerDao;
	}
	
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Job positions listed.");
				
	}

	
	@Override
	public Result add(JobPosition jobPosition) {

			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Everthing is okey. Jobposition registered to system.");

	}

	
	public boolean isExistingEmployerValid(Employer employer, List<Employer> employerList) {
		boolean result=false;		
		if(super.isExistingEmployer(employer, employerList)) {
			result=true;
		}		
		return result;
		
	}


	@Override
	public DataResult<List<JobPosition>> getActiveJobPositions() {
		List<JobPosition> activeJobPositions = new ArrayList<JobPosition>();
		
		for(JobPosition jobPosition: this.jobPositionDao.findAll()) {
			if(super.isJobPositionActive(jobPosition.getApplicationDeadline())) {
				activeJobPositions.add(jobPosition);
			}

		}
				
		return new SuccessDataResult<List<JobPosition>>(activeJobPositions, "Active Job positions listed.");
	}


	@Override
	public DataResult<List<JobPosition>> getAllJobPositionSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "applicationDeadline");
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(sort), "successful");
	}


	@Override
	public DataResult<List<JobPosition>> getByEmployer_User_Name(String employerName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.getByEmployer_User_Name(employerName), "JobPositionsforemployerNameListed");
	}


	@Override
	public Result closeJobAdvertisement(String jobPositionName) {
		// TODO Auto-generated method stub
		return new SuccessResult("Advertisement closed.");
	}



	
	
}
