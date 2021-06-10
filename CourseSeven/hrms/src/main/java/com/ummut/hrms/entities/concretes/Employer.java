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
@Table(name="isverenler")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPosition"})
public class Employer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="websitesiad")
	private String  webSite;
	@Column(name="telefon")
	private String phoneNumber;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "kullanicilar_id", referencedColumnName = "id")
	private User user;
	
	@OneToMany(mappedBy="employer", cascade = CascadeType.ALL)
	private Set<JobPosition> jobPosition;
	

	public Employer(int id, String webSite, String phoneNumber, User user, Set<JobPosition> jobPosition) {
		super();
		this.id = id;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
		this.user = user;
		this.jobPosition = jobPosition;
	}


	public Employer() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getWebSite() {
		return webSite;
	}


	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
