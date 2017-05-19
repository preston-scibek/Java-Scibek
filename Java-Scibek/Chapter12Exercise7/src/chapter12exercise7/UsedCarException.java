package chapter12exercise7;

public class UsedCarException extends Exception
{
	private static final long serialVersionUID = 1L;

	/**
	 * builds an error
	 * @param error - the error
	 */
	public UsedCarException(String error)
	{
		super("The error was the" + error);
	}

}
