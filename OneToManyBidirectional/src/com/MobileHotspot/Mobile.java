package com.MobileHotspot;

import java.util.Set;

public class Mobile {
	private Integer modelNo;
	private Long mobileNo;
	private String networkName;
	private Set branch;
	
	public Integer getModelNo() {
		return modelNo;
	}
	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public Set getBranch() {
		return branch;
	}
	public void setBranch(Set branch) {
		this.branch = branch;
	}
	
	
	}
