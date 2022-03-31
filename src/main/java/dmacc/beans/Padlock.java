package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Mar 10, 2022  
*/
@Entity
@Data
@NoArgsConstructor
public class Padlock {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private int numPins;
	private boolean hasSecurityPins;

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
}
