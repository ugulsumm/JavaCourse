package com.ummut.hrms.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ummut.hrms.business.abstracts.JobSeekerService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;
import com.ummut.hrms.entities.concretes.JobSeeker;



@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;
	//private MernisCheckService mernisCheckService;//MernisServiceAdapter ye ulaşmak için
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService=jobSeekerService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
}