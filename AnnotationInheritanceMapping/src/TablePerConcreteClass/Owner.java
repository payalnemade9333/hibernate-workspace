package TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Owner")
@AttributeOverrides({
	@AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
	@AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Owner extends Person{
	@Column(name="stocks")
	private long stocks;
	
	@Column(name="partnership_stack")
	private Long partnershipstack;

	public long getStocks() {
		return stocks;
	}

	public void setStocks(long stocks) {
		this.stocks = stocks;
	}

	public Long getPartnershipstack() {
		return partnershipstack;
	}

	public void setPartnershipstack(Long partnershipstack) {
		this.partnershipstack = partnershipstack;
	}
}
