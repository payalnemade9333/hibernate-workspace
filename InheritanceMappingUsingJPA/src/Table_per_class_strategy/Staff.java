package Table_per_class_strategy;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="staff")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Staff implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	   private int sid;
	   private String sname;
	   
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
