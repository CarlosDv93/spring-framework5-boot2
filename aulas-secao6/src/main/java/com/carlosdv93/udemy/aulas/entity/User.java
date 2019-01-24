package com.carlosdv93.udemy.aulas.entity;

public class User {
	
	private String name;
	private String email;
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public User() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
