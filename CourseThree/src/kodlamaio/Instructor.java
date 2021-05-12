package kodlamaio;

public class Instructor extends User {
	
	String certificate;
	
	public Instructor() {
		
	}
	
	public Instructor(String certificate) {
		super();
		this.certificate = certificate;
	}

	/*public Instructor(String name, String lastName, String id, String email, String phoneNumber, String adress,
			String passWord) {
		super(name, lastName, id, email, phoneNumber, adress, passWord);
		// TODO Auto-generated constructor stub
	}*/

	

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
}
