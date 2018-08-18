package com.ApplicantInterviewer;

import java.util.Set;

public class Applicant {
	private Integer applicantId;
	private String name;
	private String resume;
	private Set interviewer;
	
	public Integer getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Set getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(Set interviewer) {
		this.interviewer = interviewer;
	}	
}
