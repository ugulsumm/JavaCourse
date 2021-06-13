package com.ummut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.JobSeekerService;
import com.ummut.hrms.business.abstracts.MernisCheckService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.ErrorResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.core.utilities.results.SuccessDataResult;
import com.ummut.hrms.core.utilities.results.SuccessResult;
import com.ummut.hrms.dataAccess.abstracts.JobSeekerDao;
import com.ummut.hrms.dataAccess.abstracts.UserDao;
import com.ummut.hrms.entities.concretes.JobSeeker;
import com.ummut.hrms.mernis.Mernis;
import com.ummut.hrms.entities.concretes.User;

@Service
public class JobSeekerManager  extends JobSeekerVerificationManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	
	

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		
		super();
		this.jobSeekerDao=jobSeekerDao;
	}
	
	
	@Override
	public Result add(JobSeeker jobSeeker) {
		
		
		if(isRecordValid(jobSeeker,  this.jobSeekerDao.findAll())){
			
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Everthing is okey. Job seeker registered to system.");
		}else {
			return new ErrorResult("There is a problem. Try again.");
		}
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "All job seeker listed.");
	}
	
	Mernis mernis = new Mernis();
	MernisCheckService mernisServiceAdapter = new MernisServiceAdapter();
	
	public boolean isRecordValid(JobSeeker jobSeeker, List<JobSeeker> jobSeekerList) {
		boolean result=false;
		this.mernis.setBirthYear(jobSeeker.getBirthYear());this.mernis.setLastName(jobSeeker.getLastName());this.mernis.setName(jobSeeker.getUser().getName());this.mernis.setTcno(jobSeeker.getTcno());   ///?                                      /////////////////////////////

		if(mernisServiceAdapter.CheckIfRealPerson(mernis)&&super.isTcnoExisting(jobSeeker.getTcno(), jobSeekerList)&&super.emailVerification(jobSeeker.getUser().getEmail(), true)&&super.isAllFull(jobSeeker)&&super.isEmailExisting(jobSeeker.getUser().getEmail(), jobSeekerList)) {
			result=true;
		}
		
		return result;
		
	}




	
	
	

}
