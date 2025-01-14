package com.entity;

public class Login {
	private String Email;
	private String Password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Login [Email=" + Email + ", Password=" + Password + "]";
	}
	
	}