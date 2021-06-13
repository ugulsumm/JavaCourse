package com.ummut.hrms.apiControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ummut.hrms.business.abstracts.JobPositionService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.Result;

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
	public DataResult<List<JobPosition>> getAll(){
		
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		
		return this.jobPositionService.add(jobPosition);
		
	}
	
	
	
	@GetMapping("/getactivejobpositions")
	public DataResult<List<JobPosition>> getActiveJobPositions(){

		return this.jobPositionService.getActiveJobPositions();
	}
	
	@GetMapping("/getalldesc")
	public DataResult<List<JobPosition>> getAllJobPositionSorted(){
		
		return this.jobPositionService.getAllJobPositionSorted();
	}
	
	@GetMapping("/getjobpositionsbyemployername")
	public DataResult<List<JobPosition>> getByEmployer_User_Name(String employerName){
		
		return this.jobPositionService.getByEmployer_User_Name(employerName);
	}
	
	@PostMapping("/closejobpositionadvertisement")
	public Result closeJobAdvertisement(String jobPositionName) {
		
		return this.jobPositionService.closeJobAdvertisement(jobPositionName);
	}
	
	

}
