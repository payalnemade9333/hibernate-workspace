package com.Courtlawyer;

import java.util.Set;

public class lawyer {
	private Integer lawyerid;
	private String name;
	private String post;
	private String status;
	private Set court;
	
	public Integer getLawyerid() {
		return lawyerid;
	}
	public void setLawyerid(Integer lawyerid) {
		this.lawyerid = lawyerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set getCourt() {
		return court;
	}
	public void setCourt(Set court) {
		this.court = court;
	}
	
}
