package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String email;
	private int password;
	
	public Login() {
		super();
	}
	public Login(String email, int password) {
		super();
		email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [Email=" + email + ", password=" + password + "]";
	}
	
	
	
}
