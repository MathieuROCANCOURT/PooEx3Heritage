/**
 * 
 */
package fr.fms.entities;

/**
 * Check the Capital display.
 * 
 * @author RocancourtM
 */
public class TestCapital {
	/**
	 * TestCapital constructor
	 */
	public TestCapital() {
		super();
	}
	
	/**
	 * Main program
	 * 
	 * @param args Arguments in the command line.
	 */
	public static void main(String[] args) {
		Capital paris = new Capital("Paris", "France", 2_000_000, "Tour Eiffel");
		Capital london = new Capital("Londres", "Royaume-Uni", 9_400_000, "Bigben");
		
		System.out.println(paris);
		System.out.println(london);
	}

}
