package com.ProductsManufacturers;

import java.util.Set;

public class Products {
	private Integer productId;
	private String name;
	private Integer cost;
	private Set manufacture;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Set getManufacture() {
		return manufacture;
	}
	public void setManufacture(Set manufacture) {
		this.manufacture = manufacture;
	}

		
}
