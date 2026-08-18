/**
 * 
 */
package fr.fms.entities;

/**
 * 
 */
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** Test Capital, City and Person class **/
		Employee gate = new Employee("Gate", "Bill", 65, "USA", new Capital("Washington", "USA", 7_600_000, "W-M"), 100_000.0,
				"Fondation B&M");
		Employee musk = new Employee("Musk", "Elon", 49, "Palo Alto", new City("Pretoria", "Afrique du Sud", 800_000),
				150_000.0, "Tesla");

		System.out.println(gate);
		System.out.println(musk);
		
		/** Test Salesman class **/
		Salesman dupont = new Salesman("Dupont", "Robert", 50, "Rue des rosiers à Toulouse", new City("Limoges", "France"), "brico", 5.0);
		
		System.out.println(dupont);
		
		/** Test error values **/
		dupont.setRevenu(-5);
		dupont.setRevenu(3.5);
		
		System.out.println(dupont);
		
		/** Create Employee and Salesman list **/
		Person[] listPerson = new Person[] {gate, musk, dupont};

		System.out.println("----------------------------------------------");
		for (Person person: listPerson) {
			System.out.println(person);
		}
		System.out.println("----------------------------------------------");
	}

}
