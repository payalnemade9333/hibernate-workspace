package com.MobileHotspot;

public class Hotspot {
	private String networkName;	
	private String security;
	private String password;
	private Mobile MHObject;
	
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Mobile getMHObject() {
		return MHObject;
	}
	public void setMHObject(Mobile mHObject) {
		MHObject = mHObject;
	}
	
	
}
