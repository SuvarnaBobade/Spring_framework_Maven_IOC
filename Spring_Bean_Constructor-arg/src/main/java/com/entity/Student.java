package com.entity;

public class Student {
	private int id;
	private String Stud_name;
	private int age;
	private String stud_city;
	private Country con;
	
	public Student(int id, String stud_name, int age, String stud_city, Country con) {
		super();
		this.id = id;
		Stud_name = stud_name;
		this.age = age;
		this.stud_city = stud_city;
		this.con = con;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Stud_name=" + Stud_name + ", age=" + age + ", stud_city=" + stud_city + ", con="
				+ con + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStud_city() {
		return stud_city;
	}

	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	
}