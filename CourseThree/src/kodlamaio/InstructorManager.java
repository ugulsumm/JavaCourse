package kodlamaio;

import java.util.*;

public class InstructorManager {
	
	Scanner input = new Scanner(System.in);
	
	public void addCertificate(Instructor instructor) {
		System.out.println("Certificate name:");
		instructor.setCertificate(input.next());
		System.out.println("Certificate added.");
	}
}
