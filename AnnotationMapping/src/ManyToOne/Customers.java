package ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity 
@Table(name="Customers1")
public class Customers {
	@Id
	@Column(name="cid")
	private Integer cid;
	
	@Column(name="customerName")
	private String customerName;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Vendor.class)
	@JoinColumn(name="vid",referencedColumnName="vid")
	private Vendor parent;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Vendor getParent() {
		return parent;
	}

	public void setParent(Vendor parent) {
		this.parent = parent;
	}
}
