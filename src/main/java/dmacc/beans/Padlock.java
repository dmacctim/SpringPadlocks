package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Mar 10, 2022  
*/
@Entity
public class Padlock {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private int numPins;
	private boolean hasSecurityPins;

	public Padlock() {
		super();
	}

	public Padlock(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public Padlock(String brand, String model, int numPins, boolean hasSecurityPins) {
		super();
		this.brand = brand;
		this.model = model;
		this.numPins = numPins;
		this.hasSecurityPins = hasSecurityPins;
	}

	public Padlock(int id, String brand, String model, int numPins, boolean hasSecurityPins) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.numPins = numPins;
		this.hasSecurityPins = hasSecurityPins;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumPins() {
		return numPins;
	}

	public void setNumPins(int numPins) {
		this.numPins = numPins;
	}

	public boolean isHasSecurityPins() {
		return hasSecurityPins;
	}

	public void setHasSecurityPins(boolean hasSecurityPins) {
		this.hasSecurityPins = hasSecurityPins;
	}

	@Override
	public String toString() {
		return "Padlock [id=" + id + ", brand=" + brand + ", model=" + model + ", numPins=" + numPins
				+ ", hasSecurityPins=" + hasSecurityPins + "]";
	}
}
