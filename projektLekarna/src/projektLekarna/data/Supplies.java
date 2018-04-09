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
/**
 * @author PiòosMichal(175170)
 * Dodavatel dodava dany lek za danou cenu
 */
@Entity
@Table
public class Supplies {

	@Id
	private long id;
	@ManyToOne(fetch=EAGER)
	@JsonBackReference
	private Supplier supplier;
	@ManyToOne(fetch=EAGER)
	@JsonBackReference
	private Drug drug;
	private long cost;
	
	public Supplies() {
		
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
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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
	 * @return the cost
	 */
	public long getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(long cost) {
		this.cost = cost;
	}
}
