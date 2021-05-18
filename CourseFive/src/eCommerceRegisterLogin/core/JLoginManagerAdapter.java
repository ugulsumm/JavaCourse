package eCommerceRegisterLogin.core;

import eCommerceRegisterLogin.jLogin.JLoginManager;

public class JLoginManagerAdapter implements LoginService{

	@Override
	public boolean login(String name, String email, String password) {
		// TODO Auto-generated method stub
		JLoginManager jLoginManager = new JLoginManager();
		//jLoginManager.login(name, phoneNumber, password);
		
		return jLoginManager.login(name, email, password);
	}

	

}
