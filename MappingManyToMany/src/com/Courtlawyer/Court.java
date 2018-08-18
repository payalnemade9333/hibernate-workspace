package com.Courtlawyer;

import java.util.Set;

public class Court {
	private Integer courtno;		//PK
	private String block;
	private String name;
	private Set lawyer;				//another class set
	
	public Integer getCourtno() {
		return courtno;
	}
	public void setCourtno(Integer courtno) {
		this.courtno = courtno;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getLawyer() {
		return lawyer;
	}
	public void setLawyer(Set lawyer) {
		this.lawyer = lawyer;
	}
	
}
