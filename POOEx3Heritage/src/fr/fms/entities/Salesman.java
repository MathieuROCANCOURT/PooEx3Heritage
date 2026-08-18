/**
 * 
 */
package fr.fms.entities;

/**
 * 
 */
public class Salesman extends Person {
	private String nameCompany;
	private double revenu;

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param address
	 * @param bornCity
	 * @param nameCompany
	 * @param revenu
	 */
	public Salesman(String lastName, String firstName, int old, String address, City bornCity, String nameCompany,
			double revenu) {
		super(lastName, firstName, old, address, bornCity);
		this.nameCompany = nameCompany;
		this.revenu = revenu;
	}

	@Override
	public String toString() {
		return super.toString() + " Entreprise : " + this.nameCompany + ", % CA :" + this.revenu;
	}
}
