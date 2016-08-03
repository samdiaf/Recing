package fr.idm.Racing;

public class BadBadValueException extends Exception {
 
	String message;
	public BadBadValueException(String string) {
		super(string);
		message = string;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2297271044424696173L;

}
