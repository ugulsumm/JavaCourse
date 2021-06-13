package com.ummut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.EmployerService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.ErrorResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.core.utilities.results.SuccessDataResult;
import com.ummut.hrms.core.utilities.results.SuccessResult;
import com.ummut.hrms.dataAccess.abstracts.EmployerDao;
import com.ummut.hrms.dataAccess.abstracts.JobPositionDao;
import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobPosition;
import com.ummut.hrms.entities.concretes.JobSeeker;


@Service
public class EmployerManager extends EmployerVerificationManager implements EmployerService{
	
	private EmployerDao employerDao;
	private JobPositionDao jobPositionDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao, JobPositionDao jobPositionDao) {
		super();
		this.employerDao=employerDao;
		this.jobPositionDao=jobPositionDao;
	}
	

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listed.");
	}

	@Override
	public Result add(Employer employer) {

		if(isRecordValid(employer, this.employerDao.findAll())){
			System.out.println("employer geçerli");
			this.employerDao.save(employer);
			return new SuccessResult("Everthing is okey. Employer registered to system.");
		}else {
			System.out.println("employer geçerli değil");
			return new ErrorResult("There is a problem. Try again.");
		}

	}
	

	
	public boolean isRecordValid(Employer employer, List<Employer> employerList) {
		boolean result=false;
		
		if(super.emailVerification(employer.getUser().getEmail(), true)&&super.isAllFull(employer)&&super.isEmailExisting(employer.getUser().getEmail(), employerList)&&super.doesHrmsStaffGiveConfirmation(1)) {
			result=true;
		}
		
		return result;
		
	}


	@Override
	public Result addJobAdvertisement(Employer employer, JobPosition jobPosition) {
		
		if(isRecordValid(employer, this.employerDao.findAll())){
			System.out.println("employer geçerli");
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Everthing is okey." + jobPosition.getJobPositionName() + "registered to system.");
		}else {
			System.out.println("employer geçerli değil");
			return new ErrorResult("There is a problem. Try again.");
		}
		
	}












	


}
