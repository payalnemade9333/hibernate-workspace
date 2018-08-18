package SampleProject;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="aid")
	private Integer aid;
	
	@Column(name="admname")
	private String admname;
	
	@OneToMany(targetEntity=Project.class, cascade=CascadeType.ALL)
	@JoinColumn(name="adminid", referencedColumnName="aid")
	private Set project;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}


	public String getAdmname() {
		return admname;
	}

	public void setAdmname(String admname) {
		this.admname = admname;
	}

	public Set getProject() {
		return project;
	}

	public void setProject(Set project) {
		this.project = project;
	}
}
