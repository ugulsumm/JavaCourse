package eCommerceRegisterLogin.dataAccess.abstracts;

import java.util.List;

import eCommerceRegisterLogin.entities.concretes.Member;

public interface MemberDao {
	void add(Member member);
	void delete(Member member);
	void update(Member member);
	Member get(String email);

	List<Member> getA(List<Member> members);
	boolean register(Member member);
	void login(String email, String password);
}
