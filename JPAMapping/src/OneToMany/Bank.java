package OneToMany;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="bank")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bankid;
	
	@Column(name="bank_name")
	private String bankname;
	
	@OneToMany(targetEntity=Customers.class, cascade=CascadeType.ALL)
	@JoinColumn(name="bankid", referencedColumnName="bankid")
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
