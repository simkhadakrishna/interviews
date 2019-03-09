package misc.exception.customexception;

public class InvalidAgeException extends ArithmeticException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String msg) {
		super(msg);
	}

}
