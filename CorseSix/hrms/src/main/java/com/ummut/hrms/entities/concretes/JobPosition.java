package com.ummut.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ispozisyonlari")
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id")
	private int id; 
	@Column(name="ispozisyonlariad")
	private String jobPositionName; 
	@Column(name="isverenler_id")
	private int employersId; 
	@Column(name="isarayanlar_id")
	private int  jobSeekersId;
	public JobPosition() {
		super();
	}
	public JobPosition(int id, String jobPositionName, int employersId,int  jobSeekersId) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
		this.employersId = employersId;
		this.jobSeekersId=jobSeekersId;
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
	public int getEmployersId() {
		return employersId;
	}
	public void setEmployersId(int employersId) {
		this.employersId = employersId;
	}
	public int getJobSeekersId() {
		return jobSeekersId;
	}
	public void setJobSeekersId(int jobSeekersId) {
		this.jobSeekersId = jobSeekersId;
	}
}
