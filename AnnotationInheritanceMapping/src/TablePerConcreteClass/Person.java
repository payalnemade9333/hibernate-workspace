package TablePerConcreteClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person {
	@Id
	@Column(name="Person_Id")
	private Integer personid;
	
	@Column(name="FirstNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;

	public Integer getPersonid() {
		return personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
