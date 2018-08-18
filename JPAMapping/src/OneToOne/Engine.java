package OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="engine")
public class Engine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer engno;
	private String gearbox;
	private Integer carid;
	@OneToOne(cascade=CascadeType.ALL)
	private Car car;
	
	public Integer getEngno() {
		return engno;
	}
	public void setEngno(Integer engno) {
		this.engno = engno;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
}
