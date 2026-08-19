/**
 * 
 */
package fr.fms.entities;

/**
 * An Employee class extends the Person class with revenu and a company name.
 * 
 * @author RocancourtM
 */
public class Salesman extends Person {
	private String nameCompany;
	private double revenu;

	/**
	 * An Salesman constructor.
	 * 
	 * @param lastName    Last name.
	 * @param firstName   First name.
	 * @param old         Age.
	 * @param address     Address of the person.
	 * @param bornCity    City of birth.
	 * @param nameCompany Company name.
	 * @param revenu      Company revenu.
	 */
	public Salesman(String lastName, String firstName, int old, String address, City bornCity, String nameCompany,
			double revenu) {
		super(lastName, firstName, old, address, bornCity);
		this.nameCompany = nameCompany;
		setRevenu(revenu);
	}

	/**
	 * @param revenu the revenu to set
	 */
	public void setRevenu(double revenu) {
		if (revenu < 0) {
			System.err.println("% du chiffre d'affaire inférieur à 0 impossible.");
			if (this.revenu < 0) {
				this.revenu = 0;
			}
		} else
			this.revenu = revenu;
	}

	@Override
	public double monthlySalary() {
		return this.revenu / 100 * 50000;
	}

	@Override
	public String toString() {
		return super.toString() + " Entreprise : " + this.nameCompany + ", % CA : " + this.revenu;
	}
}
