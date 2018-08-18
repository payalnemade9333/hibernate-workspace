package com.StudentClasses;

import java.util.Set;

public class Classes {
	private Integer classid;
	private String title;
	private String description;
	private Set Student;
	
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set getStudent() {
		return Student;
	}
	public void setStudent(Set student) {
		Student = student;
	}
}
