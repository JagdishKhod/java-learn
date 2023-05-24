package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin
{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	private int adminType;
	private String adminname;
	private String adminEmail;
	private int adminPassword;
	private long adminPhone;
	
	
	public Admin() {
		super();
	}
	
	public Admin(int adminId, String adminname, String adminEmail, int adminPassword, int adminType,
			int adminPhone) {
		super();
		this.adminId = adminId;
		this.adminType = adminType;
		this.adminname = adminname;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.adminPhone = adminPhone;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public int getAdminType() {
		return adminType;
	}
	
	public void setAdminType(int adminType) {
		 this.adminType = adminType;
	}
	
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public int getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}
	public long getAdminPhone() {
		return adminPhone;
	}
	
	
	public void setAdminPhone(int adminPhone) {
		this.adminPhone = adminPhone;
	}
	
	

}