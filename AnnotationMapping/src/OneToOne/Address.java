package OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@Column(name="aid")
	private Integer aid;
	
	@Column(name="place")
	private String place;
	
	@OneToOne(targetEntity=Student.class, cascade=CascadeType.ALL)
	@JoinColumn(name="stu_id", referencedColumnName="sid")
	private Student parent;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}
}
