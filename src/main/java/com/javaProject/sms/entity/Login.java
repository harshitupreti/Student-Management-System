package com.javaProject.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOGIN_MASTER")
public class Login {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "username",nullable = false)
private String username;

@Column(name = "password", nullable = false)
private String password;

@Column(name = "email_id", nullable = false)
private String emailId;

 public Login() {
	
}

public Login(String username, String password, String emailId) {
	super();
	this.username = username;
	this.password = password;
	this.emailId = emailId;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}




}
