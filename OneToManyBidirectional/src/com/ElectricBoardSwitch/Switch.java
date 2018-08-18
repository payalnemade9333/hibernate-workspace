package com.ElectricBoardSwitch;

public class Switch {
	private Integer switchId;
	private String ampere;
	private String size;
	private Integer productId;
	private ElectricBoard EBObject;
	
	public Integer getSwitchId() {
		return switchId;
	}
	public void setSwitchId(Integer switchId) {
		this.switchId = switchId;
	}
	public String getAmpere() {
		return ampere;
	}
	public void setAmpere(String ampere) {
		this.ampere = ampere;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public ElectricBoard getEBObject() {
		return EBObject;
	}
	public void setEBObject(ElectricBoard eBObject) {
		EBObject = eBObject;
	}
	
	
}
