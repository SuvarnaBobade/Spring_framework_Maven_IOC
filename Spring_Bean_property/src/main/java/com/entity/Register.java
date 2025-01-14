package com.entity;

public class Register {
	private int id;
	private String Name;
	private String Email;
	private String Password;
	private String city;
	private long Mobile_no;
	private long Adhar_no;
	private Login login;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(int id, String name, String email, String password, String city, long mobile_no, long adhar_no,
			Login login) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Password = password;
		this.city = city;
		Mobile_no = mobile_no;
		Adhar_no = adhar_no;
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}

	public long getAdhar_no() {
		return Adhar_no;
	}

	public void setAdhar_no(long adhar_no) {
		Adhar_no = adhar_no;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", city="
				+ city + ", Mobile_no=" + Mobile_no + ", Adhar_no=" + Adhar_no + ", login=" + login + "]";
	}

}