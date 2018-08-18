package com.ProductsManufacturers;

import java.util.Set;

public class Manufacturers {
	private Integer manufactureId;
	private String name;
	private String location;
	private Set product;
	public Integer getManufactureId() {
		return manufactureId;
	}
	public void setManufactureId(Integer manufactureId) {
		this.manufactureId = manufactureId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set getProduct() {
		return product;
	}
	public void setProduct(Set product) {
		this.product = product;
	}
	
		
}
