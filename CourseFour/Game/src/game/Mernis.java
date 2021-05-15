package game;

public class Mernis {
	public boolean TCKimlikNoDogrula(String nationalityId, String firstName, String lastName, String year) {
		boolean verified=false;
		String nationalityId1 = "11111111111";
		String firstName1 = "gulsum";
		String lastName1="taban";
		String year1 ="1990";
		if(nationalityId1.equals(nationalityId)&&firstName1.equals(firstName)&&lastName1.equals(lastName)&&year1.equals(year)) {
			verified=true;
		}
		return verified;
	}
}
