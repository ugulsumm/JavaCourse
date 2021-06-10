package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.mernis.Mernis;



public interface MernisCheckService {
	public boolean CheckIfRealPerson(Mernis  mernis);
	public List<Mernis> getAll();
}
