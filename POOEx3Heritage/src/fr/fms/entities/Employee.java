/**
 * 
 */
package fr.fms.entities;

/**
 * 
 */
public class Employee extends Person{
	private String nameCompany;
	private double salary;
	
	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param salary
	 * @param nameCompany
	 */
	public Employee(String lastName, String firstName, double salary, String nameCompany) {
		super(lastName, firstName);
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
	public Employee(String lastName, String firstName, int old, String address, City bornCity, double salary, String nameCompany) {
		super(lastName, firstName, old, address, bornCity);
		this.salary = salary;
		this.nameCompany = nameCompany;
	}
	
}
