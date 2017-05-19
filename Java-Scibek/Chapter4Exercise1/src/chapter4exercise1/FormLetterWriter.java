package chapter4exercise1;

public class FormLetterWriter
{
	/**
	 * prints salutation with only last name
	 * @param lastName - last name of consumer
	 */
	public static void displaySalutation(String lastName)
	{
		System.out.printf("Dear Mr. or Ms. %s,\n\tThank you "
				+ "for your recent order.\n", lastName);
	}

	/**
	 * prints salutation with first and last name
	 * @param firstName - first name of consumer
	 * @param lastName - last name of consumer
	 */
	public static void displaySalutation(String firstName, String lastName)
	{
		System.out.printf(
				"Dear %s %s,\n\tThank you for your recent o" + "rder.\n",
				firstName, lastName);
	}

	public static void main(String[] args)
	{
		displaySalutation("Javaprogrammer");
		displaySalutation("Joe", "Consumer");
	}
}
