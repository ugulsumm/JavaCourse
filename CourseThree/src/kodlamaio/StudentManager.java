package kodlamaio;
import java.util.Scanner;
public class StudentManager{
	
	Scanner input = new Scanner(System.in);
	public void addCard(Student student) {
		System.out.println("card number:");
		student.setCardNumber(input.next());
	}
	public void addSchool(Student student) {
		System.out.println("school:");
		student.setSchool(input.next());
	}
	
}
