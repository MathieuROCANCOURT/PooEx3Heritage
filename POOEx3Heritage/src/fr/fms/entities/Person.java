package fr.fms.entities;

/**
 * A person has a first name and a last name. Age, address and city of born or
 * capital are optional.
 * 
 * @author RocancourtM
 */
public abstract class Person {
	private String lastName;
	private String firstName;
	private int old = 0;
	private String address = "unknown";
	private City bornCity = null;
	private Capital capital = null;

	/**
	 * Create a person with last name, first name, age, address and city of birth.
	 * 
	 * @param lastName  Last name.
	 * @param firstName First name.
	 * @param old       Age.
	 * @param address   Address of the person.
	 * @param bornCity  City of birth.
	 */
	protected Person(String lastName, String firstName, int old, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.bornCity = bornCity;
	}

	/**
	 * Create a person with last name, first name, age, address and capital.
	 * 
	 * @param lastName  Last name.
	 * @param firstName First name.
	 * @param old       Age.
	 * @param address   Address of the person.
	 * @param capital   Capital of birth.
	 */
	protected Person(String lastName, String firstName, int old, String address, Capital capital) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.capital = capital;
	}

	/**
	 * Check if the character is born in France.
	 * 
	 * @return true if born city is France, else false.
	 */
	public boolean bornFrance() {
		return this.bornCity.getCountry().contains("France");
	}

	/**
	 * Check if the address of the character is in Paris.
	 * 
	 * @return true if address contains Paris, else false.
	 */
	public boolean inParis() {
		return this.address.contains("Paris");
	}

	/**
	 * Calculate the monthly salary of the person.
	 * 
	 * @return Monthly salary
	 */
	public abstract double monthlySalary();

	/**
	 * Display monthly salary with 2 digits after the comma with the first name and
	 * the last name.
	 */
	public void displayMonthlySalary() {
		System.out.print("Salaire mensuel de " + this.firstName + " " + this.lastName + " : ");
		System.out.printf("%.2f", this.monthlySalary());
		System.out.println();
	}

	@Override
	public String toString() {
		String display = this.lastName + " , " + this.firstName + " , " + this.old + "ans , habitant " + this.address;

		if (this.bornCity != null) {
			display += " , Ville de naissance : " + this.bornCity.getName() + " , " + this.bornCity.getCountry();
		}

		if (this.capital != null) {
			display += " , Ville de naissance : " + this.capital.toString();
		}

		return display;
	}
}
