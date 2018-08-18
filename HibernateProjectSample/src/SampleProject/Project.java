package SampleProject;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			@Column(name="pid")
			private Integer pid;
			
			@Column(name="Project_Title")
			private String projecttitle;

			@OneToMany(targetEntity=Milestone.class, cascade=CascadeType.ALL)
			@JoinColumn(name="projid", referencedColumnName="pid")
			private Set milestone;

			public Integer getPid() {
				return pid;
			}

			public void setPid(Integer pid) {
				this.pid = pid;
			}

			public String getProjecttitle() {
				return projecttitle;
			}

			public void setProjecttitle(String projecttitle) {
				this.projecttitle = projecttitle;
			}

			public Set getMilestone() {
				return milestone;
			}

			public void setMilestone(Set milestone) {
				this.milestone = milestone;
			}
}