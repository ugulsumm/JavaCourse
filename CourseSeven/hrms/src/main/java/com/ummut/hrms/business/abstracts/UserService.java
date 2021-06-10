package com.ummut.hrms.business.abstracts;

import java.util.List;

import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll(); 
}
