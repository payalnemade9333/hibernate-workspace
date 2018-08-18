package ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Vendor1")
public class Vendor {
	@Id
	@Column(name="vid")
	private Integer vid;
	
	@Column(name="vendorName")
	private String vendorName;

	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}	
}
