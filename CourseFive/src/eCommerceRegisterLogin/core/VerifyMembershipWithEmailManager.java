package eCommerceRegisterLogin.core;

public class VerifyMembershipWithEmailManager implements VerifyMembershipWithEmailService{

	@Override
	public boolean sendVerifyEmail(String email, String password, boolean send) {
		// TODO Auto-generated method stub
		System.out.println("Email was sent to" + email +"with password: " +password);
		return send;
	}

	@Override
	public boolean clickLinkCompleteSubscription(boolean click) {	
		// TODO Auto-generated method stub
		System.out.println(click);
		return click;
	}

	@Override
	public void sendMessage(String email, boolean click) {
		// TODO Auto-generated method stub
		if(click) {
			System.out.println(email + "is valid.");
		}else {
			System.out.println(email + "is not valid.");
		}
		
		
	}

}
