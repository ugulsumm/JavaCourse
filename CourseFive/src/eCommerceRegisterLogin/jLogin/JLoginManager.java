package eCommerceRegisterLogin.jLogin;

public class JLoginManager {
	
	boolean logined=false;
	public boolean login(String name, String email, String password) {
		System.out.println("Logined with name: "+email);
		logined=true;
		return logined;
	}
}
