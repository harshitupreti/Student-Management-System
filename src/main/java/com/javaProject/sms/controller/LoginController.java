package com.javaProject.sms.controller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaProject.sms.entity.Login;
import com.javaProject.sms.service.LoginService;

@Controller
public class LoginController {

	private LoginService loginService;

	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
	}

	@GetMapping("/login")
	public String loginView(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "login";
	}

	@PostMapping("/login")
	public String loginHandeler(@ModelAttribute("login") Login login) {

		Login userAuth = loginService.getLoginDetails(login.getUsername(), login.getPassword());

		if (Objects.nonNull(userAuth)) {
			return "redirect:/students";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("/login/register")
	public String newRegistration(Model model) {

		Login register = new Login();
		model.addAttribute("register", register);
		return "register";

	}

	@PostMapping("/login/register")
	public String registrationHandeler(@ModelAttribute("register") Login register) {

		Login checkUsernameExsits = loginService.getLoginDetails(register.getUsername(), register.getPassword());

		if (Objects.nonNull(checkUsernameExsits)) {
			return "redirect:/login/register";
		} else {
			loginService.saveNewRegistration(register);
			return "redirect:/login";
		}
	}

}
