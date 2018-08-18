package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Student")
public class Student {
	@Id
	@Column(name="sid")
	private Integer sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="grp")
	private String grp;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}
}
