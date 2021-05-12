package kodlamaio;

import java.util.*;

public class UserManager {
	/*String name;
	String lastName;
	String Id;
	String email;
	String phoneNumber;
	String adress;
	String passWord;*/

	
	Scanner input = new Scanner(System.in);
	public void register(User user) {
		
		System.out.println("name:");
		//name=input.nextLine();user.setName(name);
		user.setName(input.nextLine());
		System.out.println("lastName:");
		user.setLastName(input.nextLine());
		System.out.println("phoneNumber:");
		user.setPhoneNumber(input.nextLine());
		System.out.println("email:");
		user.setEmail(input.nextLine());
		System.out.println("password:");
		user.setPassWord(input.nextLine());
		System.out.println("address:");
		user.setAdress(input.nextLine());

		System.out.println("registered");
	}
	public void login(User user) {
		//Scanner input = new Scanner(System.in);
		System.out.println("email:");
		user.setEmail(input.nextLine());
		System.out.println("password:");
		user.setPassWord(input.nextLine());
	}
	public void joinCourse() {
		System.out.println("Joined to course");
	}
}
