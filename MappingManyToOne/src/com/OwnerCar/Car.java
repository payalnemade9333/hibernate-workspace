package com.OwnerCar;

public class Car {
	private Integer carId;
	private String carName;
	private Owner parentObjects;
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Owner getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Owner parentObjects) {
		this.parentObjects = parentObjects;
	}
	
		
}
