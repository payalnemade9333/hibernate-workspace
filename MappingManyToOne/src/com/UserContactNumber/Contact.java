package com.UserContactNumber;

public class Contact {
	private Integer id;
	private String name;
	private Integer phone;
	private String mail;
	private User parentObjects;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public User getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(User parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	
}
