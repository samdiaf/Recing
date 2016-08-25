package fr.idm.Racing;

public class BadValueException extends Exception {
 
	String message;
	public BadValueException(String string) {
		super(string);
		message = string;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2297271044424696173L;

}
