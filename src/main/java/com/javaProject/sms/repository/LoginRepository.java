package com.javaProject.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.sms.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	
	List<Login> findByUsername(String username);

}
