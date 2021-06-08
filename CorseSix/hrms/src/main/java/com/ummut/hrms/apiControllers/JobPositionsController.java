package com.ummut.hrms.apiControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ummut.hrms.business.abstracts.JobPositionService;


import java.util.List;

import com.ummut.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService= jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return jobPositionService.getAll();
	}

}
