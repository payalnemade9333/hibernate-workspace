package ManyToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="lawyer")
public class Lawyer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer lawyerid;
	
	private String name;
	private String post;
	private String status;
	
	@ManyToMany(targetEntity=Court.class,mappedBy="Lawyer", cascade=CascadeType.ALL)
	private Set Court;
	
	public Integer getLawyerid() {
		return lawyerid;
	}
	public void setLawyerid(Integer lawyerid) {
		this.lawyerid = lawyerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set getCourt() {
		return Court;
	}
	public void setCourt(Set court) {
		Court = court;
	}
}
