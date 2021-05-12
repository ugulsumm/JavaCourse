package kodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		UserManager userManager = new UserManager();
		userManager.register(user);
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor();
		instructorManager.addCertificate(instructor);
		Student student= new Student();
		userManager.register(student);
		StudentManager studentManager = new StudentManager();
		studentManager.addSchool(student);
	}

}
