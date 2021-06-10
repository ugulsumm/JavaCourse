package com.ummut.hrms.business.concretes;


import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ummut.hrms.business.abstracts.JobPositionService;
import com.ummut.hrms.core.utilities.results.DataResult;
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
		
	}
	
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Job positions listed.");
				
	}

	
	@Override
	public Result add(JobPosition jobPosition) {

			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Everthing is okey. Employer registered to system.");

	}

	
	public boolean isExistingEmployerValid(Employer employer, List<Employer> employerList) {//////////////////////////
		boolean result=false;		
		if(super.isExistingEmployer(employer, employerList)) {
			result=true;
		}		
		return result;
		
	}
}
