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
public class Recipe {
	
	@Id
	private long id;
	private String prescriptionNumber;
	private int charge;
	private int limitation;

	public Recipe() {
		
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
	 * @return the prescriptionNumber
	 */
	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}
	/**
	 * @param prescriptionNumber the prescriptionNumber to set
	 */
	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
	}
	/**
	 * @return the charge
	 */
	public int getCharge() {
		return charge;
	}
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	/**
	 * @return the limitation
	 */
	public int getLimitation() {
		return limitation;
	}

	/**
	 * @param limitation the limitation to set
	 */
	public void setLimitation(int limitation) {
		this.limitation = limitation;
	}
	

}
