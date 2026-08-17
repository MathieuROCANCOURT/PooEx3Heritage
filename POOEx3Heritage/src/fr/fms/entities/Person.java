package fr.fms.entities;

/**
 * 
 */
public class Person {
	private String lastName;
	private String firstName;
	private int old;
	private String address;
	private City bornCity;

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param adress
	 */
	public Person(String lastName, String firstName, int old, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.bornCity = bornCity;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 */
	public Person(String lastName, String firstName, int old) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = "unknown";
		this.bornCity = null;
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = 0;
		this.address = "unknown";
		this.bornCity = null;
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
		String display = this.lastName + " , " + this.firstName + " , " + this.old + " , habitant " + this.address;

		if (this.bornCity != null) {
			display += " , Ville de naissance : " + this.bornCity.getName() + " , " + this.bornCity.getCountry();

			if (this.bornCity.getNbInhabitants() != 0) {
				display += " , population " + this.bornCity.getName() + " " + this.bornCity.getNbInhabitants()
						+ " d'habitants";
			}
		}

		return display;
	}
}

