package com.ummut.hrms.mernis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MernisManager implements MernisService{

		Mernis mernis1 = new Mernis();	
		Mernis mernis2 = new Mernis();
		
		List<Mernis> mernisList = new ArrayList<Mernis>();
	
	public MernisManager() {
		this.mernis1.setId(1);this.mernis1.setTcno("55555555551");this.mernis1.setName("gulsum");this.mernis1.setLastName("taban");this.mernis1.setBirthYear(1997);
		this.mernis2.setId(2);this.mernis2.setTcno("55555555552");this.mernis2.setName("ummu");this.mernis2.setLastName("tapan");this.mernis2.setBirthYear(1996);

		this.mernisList.add(mernis1);
		this.mernisList.add(mernis2);
	}
	
	
	
	@Override
	public List<Mernis> getAll() {
		
		return this.mernisList;
	}
	

	@Override
	public boolean verifyMernis(String nationalityId, String firstName, String lastName, int year) {
		boolean verified=false;
		
		for(Mernis mernis: this.mernisList) {
			if(mernis.getTcno().equals(nationalityId)&&mernis.getName().equals(firstName)&&mernis.getLastName().equals(lastName)&&mernis.getBirthYear()==year) {
				verified=true;
			}
		}
		
		return verified;
	}

}
