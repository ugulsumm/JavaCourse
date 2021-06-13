package com.ummut.hrms.mernis;

public class Mernis {

	private int id;
	private String tcno;
	private String name;
	private String lastName;
	private int birthYear;

	public Mernis() {
		super();
	}
	
	public Mernis(int id, String tcno, String name, String lastName, int birthYear) {
		super();
		this.id = id;
		this.tcno = tcno;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
