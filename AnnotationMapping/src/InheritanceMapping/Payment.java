package InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="paymode", discriminatorType=DiscriminatorType.STRING)
public class Payment {
	@Id
	@Column(name="payid")
	private Integer payid;
	
	@Column(name="amount")
	private Double amount;

	public Integer getPayid() {
		return payid;
	}

	public void setPayid(Integer payid) {
		this.payid = payid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
