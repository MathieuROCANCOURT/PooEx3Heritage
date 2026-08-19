/**
 * 
 */
package fr.fms.entities;

/**
 * An Employee class extends the Person class with revenue and a company name.
 * 
 * @author RocancourtM
 */
public class Salesman extends Person {
	private String nameCompany;
	private double revenue;

	/**
	 * An Salesman constructor.
	 * 
	 * @param lastName    Last name.
	 * @param firstName   First name.
	 * @param old         Age.
	 * @param address     Address of the person.
	 * @param bornCity    City of birth.
	 * @param nameCompany Company name.
	 * @param revenue     Company revenue.
	 */
	public Salesman(String lastName, String firstName, int old, String address, City bornCity, String nameCompany,
			double revenue) {
		super(lastName, firstName, old, address, bornCity);
		this.nameCompany = nameCompany;
		setRevenu(revenue);
	}

	/**
	 * Modify the company's revenue by checking whether the value is greater or equal to 0.
	 * 
	 * @param revenue Company revenue to set
	 */
	public void setRevenu(double revenu) {
		if (revenu < 0) {
			System.err.println("% du chiffre d'affaire inférieur à 0 impossible.");
			if (this.revenue < 0) {
				this.revenue = 0;
			}
		} else
			this.revenue = revenu;
	}

	@Override
	public double monthlySalary() {
		return this.revenue / 100 * 50000;
	}

	@Override
	public String toString() {
		return super.toString() + " Entreprise : " + this.nameCompany + ", % CA : " + this.revenue;
	}
}
