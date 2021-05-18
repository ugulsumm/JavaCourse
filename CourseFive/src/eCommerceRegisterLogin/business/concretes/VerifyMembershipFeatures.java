package eCommerceRegisterLogin.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eCommerceRegisterLogin.dataAccess.abstracts.MemberDao;
import eCommerceRegisterLogin.entities.concretes.Member;

public abstract class  VerifyMembershipFeatures {
	
	//private boolean result=false;
	
	public boolean isAllFeatureFull(Member member) {
		boolean result=false;
		if(member.getFirstName()!=null&&member.getLastName()!=null&&member.getEmail()!=null&&member.getPassword()!=null) {
			result=true;
		}
		return result;
	}
	
	public boolean isPasswordLengthBiggerThan6(Member member) {
		boolean result=false;
		if(member.getPassword().length()>=6) {
			result=true;
		}
		return result;
	}
	
	public boolean isEmailPatternMatch(Member member) {
		boolean result=false;
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(member.getEmail()).find()) {
			result=true;
		}
		return result;
	}
	
	
	public boolean isNotEmailAlreadyExists(Member member, List<Member> members) {
		boolean result=false;
		for(Member member1: members) {
			if(!member.getEmail().equals(member1.getEmail())) {
				result=true;
			}else {
				result=false;
			}
		}
		return result;
	}
	
	
	public boolean isLengthsBiggerThan2(Member member) {
		boolean result=false;
		if(member.getFirstName().length()>=2 && member.getLastName().length()>=2) {
			result=true;
		}
		return result;
	}
}
