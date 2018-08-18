package com.ElectricBoardSwitch;

import java.util.Set;

public class ElectricBoard {
	private Integer ProductId;
	private Integer size;
	private String quality;
	private String company;
	private Set child;
	
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
	
	
}
