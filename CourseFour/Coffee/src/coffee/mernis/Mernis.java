package coffee.mernis;

public class Mernis {
	public boolean TCKimlikNoDogrula(String nationalityId, String firstName, String lastName, int year) {
		boolean verified=false;
		String nationalityId1 = "11111111111";
		String firstName1 = "gulsum";
		String lastName1="taban";
		int year1 =1990;
		if(nationalityId1.equals(nationalityId)&&firstName1.equals(firstName)&&lastName1.equals(lastName)&&year1==year) {
			verified=true;
		}
		return verified;
	}
}
