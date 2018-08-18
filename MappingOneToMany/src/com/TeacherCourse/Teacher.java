package com.TeacherCourse;

import java.util.Set;

public class Teacher {
	private Integer id;
	private String name;
	private String course; 
	private Set child;
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
	
	
	
}
