package com.CarEngine;

public class Engine {
	private Integer engno;
	private String gearbox;
	private Integer carid;
	private Car car;
	
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public Integer getEngno() {
		return engno;
	}
	public void setEngno(Integer engno) {
		this.engno = engno;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
