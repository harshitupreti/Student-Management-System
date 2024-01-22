package com.javaProject.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaProject.sms.service.LoginService;

@Controller
public class LoginController {
	
	private LoginService loginService;

	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
	}
	
	@GetMapping("/login")
	public String loginHandeler() {
		return "login";
	}
	

}
