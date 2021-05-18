package eCommerceRegisterLogin.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eCommerceRegisterLogin.business.abstracts.MemberService;
import eCommerceRegisterLogin.core.LoginService;
import eCommerceRegisterLogin.core.VerifyMembershipWithEmailService;
import eCommerceRegisterLogin.dataAccess.abstracts.MemberDao;
import eCommerceRegisterLogin.entities.concretes.Member;

public class MemberManager extends VerifyMembershipFeatures implements MemberService {

	//private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	private MemberDao memberDao;
	private LoginService loginService;

	public MemberManager(MemberDao memberDao, LoginService loginService) {
		this.memberDao=memberDao;
		this.loginService=loginService;

	}
		
	
	public void sendEmailForVerify(Member member) {
		
		System.out.println("Membership created for"+ member.getEmail()+ ".");//		
		boolean verificationLink = false;
		System.out.println("Verify your membership by clicking the verification link.");
		if(verificationLink==true) {
			System.out.println("Membership verified.");
		}else if(verificationLink==false) {
			System.out.println("Membership not verified. Please click to verification link and verify your membership.");
		}		
		
	}
	
	@Override
	public boolean register(Member member, List<Member> members) {////
		// TODO Auto-generated method stub

		boolean result;

		if(super.isAllFeatureFull(member)&&super.isEmailPatternMatch(member)&&super.isLengthsBiggerThan2(member)&&super.isPasswordLengthBiggerThan6(member)&&super.isNotEmailAlreadyExists(member, members)) {
			result=true;
		}else {
			result=false;
		}		
		if(result==false) {
			System.out.println("Operation failed.");
		}else if(result==true) {
			this.memberDao.register(member);
			System.out.println("Operation is successful.");		
			System.out.println("Loginning with loginService.");
			this.loginService.login(member.getFirstName(), member.getEmail(), member.getPassword());		
		}
		System.out.println("result:"+result);
		return result;		
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		this.memberDao.login(email, password);
		System.out.println("Logined with login().");
		
	}

	@Override
	public void loginWithGoogle(String email, String password) {
		// TODO Auto-generated method stub
		this.memberDao.login(email, password);
		System.out.println("Logined with loginWithGoogle().");
	}


}
