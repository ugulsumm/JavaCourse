package com.ummut.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ummut.hrms.business.abstracts.UserService;
import com.ummut.hrms.core.utilities.results.DataResult;
import com.ummut.hrms.core.utilities.results.SuccessDataResult;
import com.ummut.hrms.dataAccess.abstracts.UserDao;
import com.ummut.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

}
