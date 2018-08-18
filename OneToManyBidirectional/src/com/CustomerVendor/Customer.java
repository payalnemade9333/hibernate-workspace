package com.CustomerVendor;

public class Customer {
	private int customerId;
	private String customerName;
	private int vendorId;
	private Vendor ParentObject;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Vendor getParentObject() {
		return ParentObject;
	}
	public void setParentObject(Vendor parentObject) {
		ParentObject = parentObject;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	
}
