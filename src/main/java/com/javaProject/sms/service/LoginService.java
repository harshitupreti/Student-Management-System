package com.javaProject.sms.service;

import com.javaProject.sms.entity.Login;

public interface LoginService {
	
	Login getLoginDetails(String username, String password);
	
	Login saveNewRegistration(Login register);

}
