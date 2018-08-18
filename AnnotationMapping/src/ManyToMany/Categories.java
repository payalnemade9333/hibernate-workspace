package ManyToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Categories {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="catName")
	private String catName;
	
	@ManyToMany(targetEntity=Items.class,cascade=CascadeType.ALL)
	@JoinTable(name="categories_items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="id"),
				inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="itemid"))
	private Set Items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Set getItems() {
		return Items;
	}

	public void setItems(Set items) {
		Items = items;
	}
	
	
}
