package com.BankCustomers;

public class Customers {
	private Integer customerid;
	private String firstname;
	private String lastname;
	private String birthdate;
	private Integer phone;
	private Integer forid;
	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getForid() {
		return forid;
	}
	public void setForid(Integer forid) {
		this.forid = forid;
	}
}
