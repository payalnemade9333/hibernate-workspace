package com.AggregateFunctions;

public class ProductsDTO {
	private int product_id=0;
	private String product_name=null;
	private int supplier_id=0;
	private int price=0;
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
