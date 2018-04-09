package projektLekarna.data;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table
public class WarehouseDrug {
	
	@Id
	private  long id;
	@ManyToOne(fetch=EAGER)
	@JsonBackReference
	private Warehouse warehouse;
	@ManyToOne(fetch=EAGER)
	@JsonBackReference
	private Drug drug;
	private int count;
	
	public WarehouseDrug() {
		
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the warehouse
	 */
	public Warehouse getWarehouse() {
		return warehouse;
	}
	/**
	 * @param warehouse the warehouse to set
	 */
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	/**
	 * @return the drug
	 */
	public Drug getDrug() {
		return drug;
	}
	/**
	 * @param drug the drug to set
	 */
	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
}
