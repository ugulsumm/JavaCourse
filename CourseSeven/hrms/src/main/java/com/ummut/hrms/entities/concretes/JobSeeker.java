package com.ummut.hrms.entities.concretes;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="isarayanlar")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPosition"})
public class JobSeeker implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	
	@Column(name="soyad")
	private String lastName;
	
	@Column(name="tcno")
	private String tcno;
	
	@Column(name="dogumyili")
	private int birthYear;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "kullanicilar_id", referencedColumnName = "id")
	private User user;
	
	@OneToMany(mappedBy="jobSeeker", cascade = CascadeType.ALL)
	private Set<JobPosition> jobPosition;
	

	public JobSeeker(int id, String lastName, String tcno, int birthYear, User user, Set<JobPosition> jobPosition) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.tcno = tcno;
		this.birthYear = birthYear;
		this.user = user;
		this.jobPosition = jobPosition;
	}


	public JobSeeker() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTcno() {
		return tcno;
	}


	public void setTcno(String tcno) {
		this.tcno = tcno;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Set<JobPosition> getJobPosition() {
		return jobPosition;
	}


	public void setJobPosition(Set<JobPosition> jobPosition) {
		this.jobPosition = jobPosition;
	}




	
	
}
