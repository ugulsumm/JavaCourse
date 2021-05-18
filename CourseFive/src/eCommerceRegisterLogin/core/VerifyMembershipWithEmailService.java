package eCommerceRegisterLogin.core;

public interface VerifyMembershipWithEmailService {
	public boolean sendVerifyEmail(String email, String password, boolean send);
	public boolean clickLinkCompleteSubscription(boolean click);
	public void sendMessage(String email, boolean click);
}
