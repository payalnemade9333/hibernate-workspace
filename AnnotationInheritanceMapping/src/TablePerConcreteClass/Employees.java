package TablePerConcreteClass;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
@AttributeOverrides({
	@AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
	@AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Employees extends Person {
	@Column(name="joining_date")
	private Date joiningdate;
	
	@Column(name="department_name")
	private String departmentname;

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
}
