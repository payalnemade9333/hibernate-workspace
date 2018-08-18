package ManyToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Items {
	@Id
	@Column(name="itemid")
	private Integer itemid;
	
	@Column(name="itemName")
	private String itemName;
	
	@ManyToMany(targetEntity=Categories.class,mappedBy="Items")
	private Set caterories;

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Set getCaterories() {
		return caterories;
	}

	public void setCaterories(Set caterories) {
		this.caterories = caterories;
	}
}
