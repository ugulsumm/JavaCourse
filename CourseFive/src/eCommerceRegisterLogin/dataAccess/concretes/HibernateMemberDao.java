package eCommerceRegisterLogin.dataAccess.concretes;

import java.util.List;

import eCommerceRegisterLogin.dataAccess.abstracts.MemberDao;
import eCommerceRegisterLogin.entities.concretes.Member;

public class HibernateMemberDao implements MemberDao{

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member get(String email) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean register(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getFirstName() + " registered.");
		return true;
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println(email + "logined.");
	}

	@Override
	public List<Member> getA(List<Member> members) {
		// TODO Auto-generated method stub
		return members;
	}

}
