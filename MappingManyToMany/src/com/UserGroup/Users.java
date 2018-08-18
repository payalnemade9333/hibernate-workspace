package com.UserGroup;

import java.util.Set;

public class Users {
	private Integer userId;
	private String userName;
	private Integer mobileNo;
	private Set groups;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Set getGroups() {
		return groups;
	}
	public void setGroups(Set groups) {
		this.groups = groups;
	}
	
	
	
}
