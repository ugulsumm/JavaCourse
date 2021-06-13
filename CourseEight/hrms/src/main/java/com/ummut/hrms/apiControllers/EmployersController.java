package com.ummut.hrms.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ummut.hrms.business.abstracts.EmployerService;
import com.ummut.hrms.business.abstracts.JobPositionService;
import com.ummut.hrms.business.abstracts.JobSeekerService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.Employer;
import com.ummut.hrms.entities.concretes.JobPosition;
import com.ummut.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employerService;
	private JobPositionService jobPositionService;
	@Autowired
	public EmployersController(EmployerService employerService, JobPositionService jobPositionService) {
		super();
		this.employerService=employerService;
		this.jobPositionService=jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	@PostMapping("/addJobPosition")
	public Result addJobAdvertisement(Employer employer, JobPosition jobPosition) {
	
		jobPosition.setEmployer(employer);
		return this.jobPositionService.add(jobPosition);
	}
}
