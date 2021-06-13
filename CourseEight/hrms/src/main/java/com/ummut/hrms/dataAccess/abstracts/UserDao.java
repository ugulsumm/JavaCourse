package com.ummut.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ummut.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
