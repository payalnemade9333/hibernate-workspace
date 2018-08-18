package OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer carid;
	
	private String carname;
	private Integer price;
	
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
