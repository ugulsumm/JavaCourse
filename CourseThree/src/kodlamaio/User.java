package kodlamaio;
import java.util.Random;
public class User {
	private String name;
	private String lastName;
	private String Id;
	private String email;
	private String phoneNumber;
	private String adress;
	private String passWord;
	
	public User() {
		
	}
	
	public User(String name, String lastName, String id, String email, String phoneNumber, String adress,
			String passWord) {
		super();
		this.name = name;
		this.lastName = lastName;
		Id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.passWord = passWord;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getId() {

		Random r=new Random(); 
		int id=r.nextInt(1000);
		Id=Integer.toString(id);
		return Id;
	}


	
	
}
