package com.javaProject.sms.service;

import java.util.List;

import com.javaProject.sms.entity.Login;

public interface LoginService {
	
	List<Login> getLoginDetails(Login login);

}
