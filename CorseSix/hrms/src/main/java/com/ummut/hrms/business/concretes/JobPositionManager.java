package com.ummut.hrms.business.concretes;


import com.ummut.hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.JobPositionService;
import com.ummut.hrms.dataAccess.abstracts.JobPositionDao;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao=jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}

}
