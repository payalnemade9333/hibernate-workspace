package com.ApplicantInterviewer;

import java.util.Set;

public class Interviewer {
	private Integer interviewerId;
	private String name;
	private String department;
	private String date;
	private Set applicants;
	
	public Integer getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(Integer interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Set getApplicants() {
		return applicants;
	}
	public void setApplicants(Set applicants) {
		this.applicants = applicants;
	}
	
		
}
