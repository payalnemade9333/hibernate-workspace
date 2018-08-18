package InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="CCARD")
public class CreditCardPayment extends Payment{
	
	@Column(name="ccnumber")
	private Integer ccnumber;
	
	@Column(name="cctype")
	private String cctype;

	public Integer getCcnumber() {
		return ccnumber;
	}

	public void setCcnumber(Integer ccnumber) {
		this.ccnumber = ccnumber;
	}

	public String getCctype() {
		return cctype;
	}

	public void setCctype(String cctype) {
		this.cctype = cctype;
	}
}
