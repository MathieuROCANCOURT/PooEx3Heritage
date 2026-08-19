/**
 * 
 */
package fr.fms.entities;

/**
 * An Employee class extends the Person class with salary and a company name.
 * 
 * @author RocancourtM
 */
public class Employee extends Person {
	private String nameCompany;
	private double salary;

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param address
	 * @param bornCity
	 * @param salary
	 * @param nameCompany
	 */
	public Employee(String lastName, String firstName, int old, String address, City bornCity, double salary,
			String nameCompany) {
		super(lastName, firstName, old, address, bornCity);
		this.salary = salary;
		this.nameCompany = nameCompany;
	}

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param address
	 * @param bornCity
	 * @param salary
	 * @param nameCompany
	 */
	public Employee(String lastName, String firstName, int old, String address, Capital capital, double salary,
			String nameCompany) {
		super(lastName, firstName, old, address, capital);
		this.salary = salary;
		this.nameCompany = nameCompany;
	}

	@Override
	public double monthlySalary() {
		// TODO Auto-generated method stub
		return this.salary * 0.8;
	}

	@Override
	public String toString() {
		return super.toString() + " , Entreprise : " + this.nameCompany + " , salaires : " + this.salary;
	}
}
