package com.StudentAddress;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private Integer zipcode;
	private Student Object;
	public Student getObject() {
		return Object;
	}
	public void setObject(Student object) {
		Object = object;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	
		
}
