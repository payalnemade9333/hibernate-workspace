package com.StateCapital;

public class State {
	private Integer pinprefix;
	private String statename;
	private String description;
	private Capital capital;
	private Integer capitalid;
	
	
	public Integer getCapitalid() {
		return capitalid;
	}
	public void setCapitalid(Integer capitalid) {
		this.capitalid = capitalid;
	}
	public Integer getPinprefix() {
		return pinprefix;
	}
	public void setPinprefix(Integer pinprefix) {
		this.pinprefix = pinprefix;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}	
}
