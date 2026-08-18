package fr.fms.entities;

/**
 * 
 */
public class Person {
	private String lastName;
	private String firstName;
	private int old = 0;
	private String address = "unknown";
	private City bornCity = null;
	private Capital capital = null;

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param address
	 * @param bornCity
	 */
	public Person(String lastName, String firstName, int old, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.bornCity = bornCity;
	}

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param address
	 * @param capital
	 */
	public Person(String lastName, String firstName, int old, String address, Capital capital) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.capital = capital;
	}

	/**
	 * @return
	 */
	public boolean bornFrance() {
		return this.bornCity.getCountry().contains("France");
	}

	public boolean inParis() {
		return this.address.contains("Paris");
	}

	@Override
	public String toString() {
		String display = this.lastName + " , " + this.firstName + " , " + this.old + "ans , habitant " + this.address;

		if (this.bornCity != null) {
			display += " , Ville de naissance : " + this.bornCity.getName() + " , " + this.bornCity.getCountry();

			if (this.bornCity.getNbInhabitants() != 0) {
				display += " , " + this.bornCity.getNbInhabitants() + " d'habitants";
			}
		}

		if (this.capital != null) {
			display += " , Ville de naissance : " + this.capital.toString();
		}

		return display;
	}
}
