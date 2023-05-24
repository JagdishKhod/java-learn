package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String firstname;
	private String lastname;

	private String email;
	private String username;

	private int userAge;
	private int userpassword;
	private String city;
	private String gender;
	private int phone;

	
	
	// USER MANY ROLES

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
	private Set<UserRole> userRoles = new HashSet<UserRole>();

	// user
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	@ManyToOne
	private Role role;

	public User()
	{
		super();
	}
	
	

	public User(int id, String firstname, String lastname, String email, String username, String city, int userAge,
			String gender, int userpassword, int phone, Set<UserRole> userRoles, User user, Role role) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.city = city;
		this.userAge = userAge;
		this.gender = gender;
		this.userpassword = userpassword;
		this.phone = phone;
		this.userRoles = userRoles;
		this.user = user;
		this.role = role;
	}



	public User(String firstname, String lastname, String email, String username, String city, int userAge,
			String gender, int userpassword, int phone, Set<UserRole> userRoles, User user, Role role) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.city = city;
		this.userAge = userAge;
		this.gender = gender;
		this.userpassword = userpassword;
		this.phone = phone;
		this.userRoles = userRoles;
		this.user = user;
		this.role = role;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getUserAge() {
		return userAge;
	}



	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getUserpassword() {
		return userpassword;
	}



	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public Set<UserRole> getUserRoles() {
		return userRoles;
	}



	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", username=" + username + ", city=" + city + ", userAge=" + userAge + ", gender=" + gender
				+ ", userpassword=" + userpassword + ", phone=" + phone + ", userRoles=" + userRoles + ", user=" + user
				+ ", role=" + role + "]";
	}
}