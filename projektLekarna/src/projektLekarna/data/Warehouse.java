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
public class Warehouse {
	@Id
	private long id;
	private String name;
	private String street;
	private String city;
	private String phone;
	private String email;
	
	@OneToMany(cascade = { ALL }, fetch = EAGER, mappedBy = "warehouse", orphanRemoval = true)
    @JsonManagedReference
	private Collection<WarehouseDrug> drugs ;
	
	public Warehouse() {
		drugs = new Vector<WarehouseDrug>();
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
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the drugs
	 */
	public Collection<WarehouseDrug> getDrugs() {
		return drugs;
	}
	/**
	 * @param drugs the drugs to set
	 */
	public void setDrugs(Collection<WarehouseDrug> drugs) {
		this.drugs = drugs;
	}
	
	
}
