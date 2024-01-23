package com.javaProject.sms.service.impl;

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
	public Login getLoginDetails(String username, String password) {
		
		Login user = loginRepository.findByUsernameAndPassword(username, password);
		return user;
		
		
	}

	@Override
	public Login saveNewRegistration(Login register) {
		
		return loginRepository.save(register);
	}

}
