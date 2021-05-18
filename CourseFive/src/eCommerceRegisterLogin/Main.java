package eCommerceRegisterLogin;

import java.util.ArrayList;
import java.util.List;

import eCommerceRegisterLogin.business.abstracts.MemberService;
import eCommerceRegisterLogin.business.concretes.MemberManager;
import eCommerceRegisterLogin.core.JLoginManagerAdapter;
import eCommerceRegisterLogin.core.VerifyMembershipWithEmailManager;
import eCommerceRegisterLogin.core.VerifyMembershipWithEmailService;
import eCommerceRegisterLogin.dataAccess.concretes.HibernateMemberDao;
import eCommerceRegisterLogin.entities.concretes.Member;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member();Member member2 = new Member();Member member3 = new Member();
		member1.setEmail("tbn@gmail.com");member1.setFirstName("ayda");member1.setLastName("oz");member1.setPassword("9999999");
		members.add(member1);
		member2.setEmail("btr@gmail.com");member1.setFirstName("leyla");member1.setLastName("kok");member1.setPassword("14789");
		members.add(member2);
		member3.setEmail("cnz@gmail.com");member1.setFirstName("sevda");member1.setLastName("sari");member1.setPassword("45687");
		members.add(member3);
		
		Member member = new Member();
		member.setEmail("cnt@gmail.com");member.setFirstName("gulsum");member.setLastName("taban");member.setPassword("123456");
		
		/*for(Member mem: members) {
			System.out.println(mem.getEmail());
			if(member.getEmail().equals(mem.getEmail())) {
				System.out.println("eþit");
			}else {
				System.out.println("eþit deðil, geçerli");
			}
		}*/
		
		
		MemberService memberManager = new MemberManager(new HibernateMemberDao(), new JLoginManagerAdapter());
		memberManager.register(member, members);
		
		
		VerifyMembershipWithEmailService  verifyMembershipWithEmailManager = new VerifyMembershipWithEmailManager();
		if(memberManager.register(member, members)) {
			verifyMembershipWithEmailManager.sendVerifyEmail(member.getEmail(), member.getPassword(), true);
			verifyMembershipWithEmailManager.clickLinkCompleteSubscription(true);
			verifyMembershipWithEmailManager.sendMessage(member.getEmail(), true);
			
			if(verifyMembershipWithEmailManager.sendVerifyEmail(member.getEmail(), member.getPassword(), true)&&verifyMembershipWithEmailManager.clickLinkCompleteSubscription(true)) {
				memberManager.login(member.getEmail(), member.getPassword());
			}
		}
			
		
		
		
	}

}
