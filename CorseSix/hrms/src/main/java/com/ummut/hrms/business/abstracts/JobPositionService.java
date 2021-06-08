package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
