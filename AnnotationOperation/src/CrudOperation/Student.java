package CrudOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Id
	@Column(name="studentid")
	private Integer studentid;
	
	@Column(name="studentname")
	private String studentname;
	
	@Column(name="rollno")
	private Integer rollno;
	
	@Column(name="course")
	private String course;

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
