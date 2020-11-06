package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="zuser")
public class User {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name",nullable = false)
   private String userName;
	@Column(name="user_pass",nullable = false)
   private String userPass;
	@Column(name="email",nullable = false)
	private String email;
	@Column(name="phone",nullable = false)
	private String phone;
	@Column(name="address",nullable = false)
	private String address;
public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
public User() {
	
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}
@Override
public String toString() {
	return userName;
}


   
}
