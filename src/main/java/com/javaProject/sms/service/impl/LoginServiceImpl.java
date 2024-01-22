package com.javaProject.sms.service.impl;

import java.util.List;

import com.javaProject.sms.entity.Login;
import com.javaProject.sms.repository.LoginRepository;
import com.javaProject.sms.service.LoginService;

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
