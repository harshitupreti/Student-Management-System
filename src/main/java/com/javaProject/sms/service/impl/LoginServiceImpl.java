package com.javaProject.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaProject.sms.entity.Login;
import com.javaProject.sms.repository.LoginRepository;
import com.javaProject.sms.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	private LoginRepository loginRepository;
	
	public LoginServiceImpl(LoginRepository loginRepository) {
		super();
		this.loginRepository = loginRepository;
	}

	@Override
	public List<Login> getLoginDetails(Login login) {
		
		return loginRepository.findByUsername(login.getUsername());
		
		
	}

}
