package com.CustomersVendor;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
	@Id
	@Column(name="vid")
	private Integer vid;
	
	@Column(name="vendorName")
	private String vendorName;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Customers.class, cascade=CascadeType.ALL)
	@JoinColumn(name="vid", referencedColumnName="vid")
	private Set children;

	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}
}
