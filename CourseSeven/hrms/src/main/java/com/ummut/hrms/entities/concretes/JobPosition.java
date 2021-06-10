package com.ummut.hrms.entities.concretes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


  
@Entity
@Table(name="ispozisyonlari")
public class JobPosition implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id; 
	@Column(name="ispozisyonlariad")
	private String jobPositionName;
	
	//@ManyToOne
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name="isverenler_id")
	private Employer employer;
	
	//@ManyToOne
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name="isarayanlar_id")
	private JobSeeker jobSeeker;
	
	

	public JobPosition(int id, String jobPositionName, Employer employer, JobSeeker jobSeeker
			) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
		this.employer = employer;
		this.jobSeeker = jobSeeker;

	}

	public JobPosition() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobPositionName() {
		return jobPositionName;
	}

	public void setJobPositionName(String jobPositionName) {
		this.jobPositionName = jobPositionName;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	
 
	
}
