package ManyToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="court")
public class Court {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer courtno;	
	
	private String block;
	private String name;
	
	@ManyToMany(targetEntity=Lawyer.class, cascade=CascadeType.ALL)
	@JoinTable(name="Court_lawyer",joinColumns=@JoinColumn(name="cou_id_fk",referencedColumnName="courtno"),
	inverseJoinColumns=@JoinColumn(name="lawyer_id_fk",referencedColumnName="lawyerid"))
	private Set Lawyer;
	
	public Integer getCourtno() {
		return courtno;
	}
	public void setCourtno(Integer courtno) {
		this.courtno = courtno;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getLawyer() {
		return Lawyer;
	}
	public void setLawyer(Set lawyer) {
		Lawyer = lawyer;
	}
	
}
