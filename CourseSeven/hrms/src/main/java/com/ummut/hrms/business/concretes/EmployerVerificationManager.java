package com.ummut.hrms.business.concretes;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.EmployerVerificationService;
import com.ummut.hrms.entities.concretes.Employer;

@Service
public abstract class EmployerVerificationManager implements EmployerVerificationService{
	
	@Override
	public boolean emailVerification(String employerEmail, boolean send) {
		System.out.println("Verification email sent to " + employerEmail+ " .");
		System.out.println("emailVerification result: "+ send);
		return send;
	}
	

	@Override
	public boolean isAllFull(Employer employer) {
		boolean result=false;
		if(employer.getUser().getName()!=null&&employer.getWebSite()!=null&&employer.getUser().getEmail()!=null&&employer.getPhoneNumber()!=null&&employer.getUser().getPassword()!=null&&employer.getUser().getRepeatPassword()!=null) {
			result = true;
		}
		System.out.println("isAllFull result: "+ result);
		return result;
	}
	
	@Override
	public boolean isEmailExisting(String email, List<Employer> employerList) {
		boolean result=true;
		for(Employer employer: employerList) {
			if(email.equals(employer.getUser().getEmail())) {
				result = false;
			}
		}
		System.out.println("isEmailExisting result: "+ result);
		return result;
	}

	
	
	
	
	
	
	@Override
	public boolean doesHrmsStaffGiveConfirmation(int confirmation) {
		System.out.println("Is it real company? Pick 0 or 1");
		boolean result;
		/*try (Scanner input = new Scanner(System.in)) {
			confirmation = input.nextInt();
		}*/
		confirmation=1;
		if(confirmation==1) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}

	

}
