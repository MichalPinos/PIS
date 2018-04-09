package projektLekarna.data;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table
public class Drug {

	@Id
	private long id;
	private String name;
	private String description;
	private long soldQuantity;		//prodane mnozstvi
	
	@OneToMany(cascade = { ALL }, fetch = EAGER, mappedBy = "drug", orphanRemoval = true)
    @JsonManagedReference
	private Collection<Supplies> suppliers ;
	
	@OneToMany(cascade = { ALL }, fetch = EAGER, mappedBy = "drug", orphanRemoval = true)
    @JsonManagedReference
	private Collection<WarehouseDrug> warehouses ;
	
	public Drug() {
		setSuppliers(new Vector<Supplies>());
		warehouses = new Vector<WarehouseDrug>();
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the soldQuantity
	 */
	public long getSoldQuantity() {
		return soldQuantity;
	}

	/**
	 * @param soldQuantity the soldQuantity to set
	 */
	public void setSoldQuantity(long soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	/**
	 * @return the suppliers
	 */
	public Collection<Supplies> getSuppliers() {
		return suppliers;
	}

	/**
	 * @param suppliers the suppliers to set
	 */
	public void setSuppliers(Collection<Supplies> suppliers) {
		this.suppliers = suppliers;
	}

	/**
	 * @return the warehouses
	 */
	public Collection<WarehouseDrug> getWarehouses() {
		return warehouses;
	}

	/**
	 * @param warehouses the warehouses to set
	 */
	public void setWarehouses(Collection<WarehouseDrug> warehouses) {
		this.warehouses = warehouses;
	}
	
}
