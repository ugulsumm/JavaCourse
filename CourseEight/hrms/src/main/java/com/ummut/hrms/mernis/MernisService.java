package com.ummut.hrms.mernis;

import java.util.List;



public interface MernisService {
	List<Mernis> getAll(); 
	boolean verifyMernis(String nationalityId, String firstName, String lastName, int year);
}
