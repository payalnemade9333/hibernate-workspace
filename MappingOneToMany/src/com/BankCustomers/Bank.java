package com.BankCustomers;

import java.util.Set;

public class Bank {
	private Integer bankid;
	private String bankname;
	private Set branch;
	
	public Integer getBankid() {
		return bankid;
	}
	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public Set getBranch() {
		return branch;
	}
	public void setBranch(Set branch) {
		this.branch = branch;
	}
}
