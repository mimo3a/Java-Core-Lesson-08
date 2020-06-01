 /* Logos Academy*/

package ua.lviv.lga.enumerations;

/**
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 */

public class WrongInputConsoleParametersException extends Exception{
	String message;

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
		
	}
	
	
	

}
