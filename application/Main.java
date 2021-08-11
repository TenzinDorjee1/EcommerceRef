<<<<<<< Updated upstream:Main.java
public class Main extends HomePage{
=======
package application;

/**
 * Runs the whole application
 */
public class Main{
	/**
	 * default main method
	 * @param args
	 */
>>>>>>> Stashed changes:application/Main.java
	public static void main(String args[]) {
		System.out.println("Welcome to our Ecommerce Application!");
		HomePage UserTestIn = new HomePage();
		UserTestIn.HomeOptions();
		// while true the programs home options will continue to loop
		while (true) {
			UserTestIn.HomeOptions();
		}
	}
}


