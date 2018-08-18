package Table_per_class_strategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="teachingstaff")
public class TeachingStaff extends Staff {
	 private String qualification;
	 private String subjectexpertise;
	 
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubjectexpertise() {
		return subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
}
