package InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CHQ")
public class ChequePayment extends Payment{
	
	@Column(name="chqnumber")
	private Integer chqnumber;
	
	@Column(name="chtype" )
	private String chtype;

	public Integer getChqnumber() {
		return chqnumber;
	}

	public void setChqnumber(Integer chqnumber) {
		this.chqnumber = chqnumber;
	}

	public String getChtype() {
		return chtype;
	}

	public void setChtype(String chtype) {
		this.chtype = chtype;
	}
}
