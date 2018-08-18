package Table_per_class_strategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nonteachingstaff")
public class NonTeachingStaff extends Staff {
	 private String areaexpertise;

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	 
}
