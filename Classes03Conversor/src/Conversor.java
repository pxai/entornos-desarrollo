/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Conversor {

	private static final double CHANGE_PESETAS_EUROS = 166.386d;
	private static final double CHANGE_DOLLARS_EUROS = 0.9d; // fake
	private static final double CHANGE_POUNDS_EUROS = 0.8d; // fake..

	/**
	 * converts pesetas to euros
	 * @param amount
	 * @return
	 */
	public double pesetasToEuros (double amount) {
		double result = 0;
		
		result = amount / CHANGE_PESETAS_EUROS;
		
		return result;
	}
	
	/**
	 * converts euros to pesetas
	 * @param amount
	 * @return
	 */
	public double eurosToPesetas (double amount) {
		double result = 0;
		
		result = amount * CHANGE_PESETAS_EUROS;
		
		return result;
	}
	
	/**
	 * converts dollars to euros
	 * @param amount
	 * @return
	 */
	public double dollarsToEuros (double amount) {
		double result = 0;
		
		result = amount / CHANGE_DOLLARS_EUROS;
		
		return result;
	}

	/**
	 * converts euros to dollars
	 * @param amount
	 * @return
	 */
	public double eurosToDollars (double amount) {
		double result = 0;
		
		result = amount * CHANGE_DOLLARS_EUROS;
		
		return result;
	}

	/**
	 * converts dollars to euros
	 * @param amount
	 * @return
	 */
	public double poundsToEuros (double amount) {
		double result = 0;
		
		result = amount / CHANGE_POUNDS_EUROS;
		
		return result;
	}

	/**
	 * converts euros to pounds
	 * @param amount
	 * @return
	 */
	public double eurosToPounds (double amount) {
		double result = 0;
		
		result = amount * CHANGE_POUNDS_EUROS;
		
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conversor mySuperConversor = new Conversor();
		
		// Convert pesetas to euros
		double result = mySuperConversor.pesetasToEuros(1000000);
		System.out.println("Total euros: " + result + "€");
		
		

	}

}
