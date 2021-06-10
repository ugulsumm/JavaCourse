package com.ummut.hrms.business.concretes;

import java.util.List;

import com.ummut.hrms.business.abstracts.MernisCheckService;
import com.ummut.hrms.mernis.Mernis;
import com.ummut.hrms.mernis.MernisManager;
import com.ummut.hrms.mernis.MernisService;

public class MernisServiceAdapter implements MernisCheckService{

	MernisService  mernisManager = new MernisManager();
	
	@Override
	public boolean CheckIfRealPerson(Mernis mernis) {
		boolean verification=false;
		
		verification = this.mernisManager.verifyMernis(mernis.getTcno(), mernis.getName(), mernis.getLastName(), mernis.getBirthYear());
		System.out.println("CheckIfRealPerson result:" + verification);
		return verification;
	}

	
	@Override
	public List<Mernis> getAll() {

		return this.mernisManager.getAll();
	}







}
