package kodlamaio;

public class Student extends User{
	String school;
	String cardNumber;
	
	public Student() {
		
	}
	
	public Student(String school, String cardNumber) {
		super();
		this.school = school;
		this.cardNumber = cardNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
