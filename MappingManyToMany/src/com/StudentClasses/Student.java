package com.StudentClasses;

import java.util.Set;

public class Student {
	private Integer studentid;
	private String firstname;
	private String lastname;
	private Set Classes;
	
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
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
	public Set getClasses() {
		return Classes;
	}
	public void setClasses(Set classes) {
		Classes = classes;
	}
	
	
}
