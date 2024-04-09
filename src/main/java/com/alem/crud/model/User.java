package com.alem.crud.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column (name = "id")
	private int id;
	@Column (name = "firstname")
	private String firstname;
	@Column (name = "lastname")
	private String lastname;
	@Column (name = "password")
	private String password;
	@Column (name = "email")
	private String email;
	@Column (name = "phone")
	private int phone;
	@Column (name = "address")
	private String address;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
//    private List<SecurityQuestion> securityQuestions = new ArrayList<SecurityQuestion>();
	@Column (name = "securityquestion1")
	private String securityquestion1;
	@Column (name = "answer1")
	private String answer1;
	@Column (name = "securityquestion2")
	private String securityquestion2;
	@Column (name = "answer2")
	private String answer2;
	
	
	public String getSecurityquestion1() {
		return securityquestion1;
	}
	public void setSecurityquestion1(String securityquestion1) {
		this.securityquestion1 = securityquestion1;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getSecurityquestion2() {
		return securityquestion2;
	}
	public void setSecurityquestion2(String securityquestion2) {
		this.securityquestion2 = securityquestion2;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public List<SecurityQuestion> getSecurityQuestions() {
//		return securityQuestions;
//	}
//	public void setSecurityQuestions(List<SecurityQuestion> securityQuestions) {
//		this.securityQuestions = securityQuestions;
//	}
	
	
	
	
	
}
