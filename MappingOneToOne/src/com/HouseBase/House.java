package com.HouseBase;

public class House {
	private Integer houseno;
	private String ownername;
	private Integer plotno;
	private Base base;
	
	public Integer getPlotno() {
		return plotno;
	}
	public void setPlotno(Integer plotno) {
		this.plotno = plotno;
	}
	public Integer getHouseno() {
		return houseno;
	}
	public void setHouseno(Integer houseno) {
		this.houseno = houseno;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
}
