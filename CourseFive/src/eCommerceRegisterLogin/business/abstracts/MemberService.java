package eCommerceRegisterLogin.business.abstracts;

import java.util.List;

import eCommerceRegisterLogin.entities.concretes.Member;

public interface MemberService {
	boolean register(Member member,List<Member> members);
	void login(String email, String password);
	void loginWithGoogle(String email, String password);
}
