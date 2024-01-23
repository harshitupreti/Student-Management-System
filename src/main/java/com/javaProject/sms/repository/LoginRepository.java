package com.javaProject.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.sms.entity.Login;


public interface LoginRepository extends JpaRepository<Login, Long>{
	
	
	Login findByUsernameAndPassword(String username, String password);

}
