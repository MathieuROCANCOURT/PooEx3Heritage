/**
 * 
 */
package fr.fms.entities;

/**
 * Class capital that is a City plus a monument.
 * 
 * @author RocancourtM
 */
public class Capital extends City {
	private String monument;

	/**
	 * @param name
	 * @param country
	 * @param nbInhabitants
	 * @param monument
	 */
	public Capital(String name, String country, int nbInhabitants, String monument) {
		super(name, country, nbInhabitants);
		this.monument = monument;
	}

	@Override
	public String toString() {
		return super.getName() + " , " + super.getCountry() + " , monument : " + this.monument;
	}
}
