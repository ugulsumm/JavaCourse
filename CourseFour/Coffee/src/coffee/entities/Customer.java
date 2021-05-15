package coffee.entities;

import java.util.Date;

public class Customer {
	private int Id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String NationalityId;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	

	
}
