package com.ummut.hrms.entities.concretes;

import java.io.Serializable;
import java.sql.Date;

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
	
	@Column(name="istanimi")
	private String jobDescription;
	@Column(name="sehir")
	private String city;
	@Column(name="maasaraligi")
	private String salaryRange;
	@Column(name="acikpozisyonadedi")
	private int numberOpenPosition;
	@Column(name="sonbasvurutarihi")
	private Date applicationDeadline;
	

		@ManyToOne(fetch = FetchType.LAZY, optional=false)
		@JoinColumn(name="isverenler_id")
		private Employer employer;
		
		@ManyToOne(fetch = FetchType.LAZY, optional=false)
		@JoinColumn(name="isarayanlar_id")
		private JobSeeker jobSeeker;
	
	public JobPosition(int id, String jobPositionName, String jobDescription, String city, String salaryRange,
			int numberOpenPosition, Date applicationDeadline, Employer employer, JobSeeker jobSeeker) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
		this.jobDescription = jobDescription;
		this.city = city;
		this.salaryRange = salaryRange;
		this.numberOpenPosition = numberOpenPosition;
		this.applicationDeadline = applicationDeadline;
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


	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSalaryRange() {
		return salaryRange;
	}


	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}


	public int getNumberOpenPosition() {
		return numberOpenPosition;
	}


	public void setNumberOpenPosition(int numberOpenPosition) {
		this.numberOpenPosition = numberOpenPosition;
	}


	public Date getApplicationDeadline() {
		return applicationDeadline;
	}


	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	
 
	
}
