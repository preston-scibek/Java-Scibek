package chapter7exercise12;

import java.util.Scanner;

public class PrepareTax
{
	/**
	 * prepares a tax return
	 */
	public static void prepareTax()
	{
		Scanner userInputKeyboard = new Scanner(System.in);
		String firstName;
		String lastName;
		String socialSecurityNumber;
		String streetAddress;
		String city;
		String state;
		String zipCode;
		double annualIncome;
		String isMarried;
		System.out.print("Enter your first name: ");
		firstName = userInputKeyboard.nextLine();
		System.out.print("\nEnter your last name: ");
		lastName = userInputKeyboard.nextLine();
		System.out.print("\nEnter your SSN: ");
		socialSecurityNumber = userInputKeyboard.nextLine();
		System.out.print("\nEnter your street address: ");
		streetAddress = userInputKeyboard.nextLine();
		System.out.print("\nEnter your city: ");
		city = userInputKeyboard.nextLine();
		System.out.print("\nEnter your state: ");
		state = userInputKeyboard.nextLine();
		System.out.print("\nEnter your zip code: ");
		zipCode = userInputKeyboard.nextLine();
		System.out.print("\nEnter your marital status: ");
		isMarried = userInputKeyboard.nextLine();
		System.out.print("\nEnter your annual income: ");
		annualIncome = userInputKeyboard.nextDouble();
		userInputKeyboard.nextLine();
		while(socialSecurityNumber.matches(
				"[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]") != true)
		{
			System.out.print("\nRe-Enter your SSN. Make sure its in the for"
					+ "mat " + "###-##-####");
			socialSecurityNumber = userInputKeyboard.nextLine();
		}
		while(zipCode.length() != 5)
		{
			System.out.print(
					"\nRe-Enter your zip code. Make sures its 5 " + "digits");
			zipCode = userInputKeyboard.nextLine();
		}
		while(isMarried.toLowerCase().startsWith("m") != true
				&& isMarried.toLowerCase().startsWith("s") != true)
		{
			System.out.print("\nRe-Enter your marital status. Make sure i" + ""
					+ "t starts with m, M, s, or S.");
			isMarried = userInputKeyboard.nextLine();

		}
		while(annualIncome < 0)
		{
			System.out.print("\nRe-Enter your annual Income. Make sure"
					+ " it is not negative");
			annualIncome = userInputKeyboard.nextDouble();
		}
		userInputKeyboard.close();
		TaxReturn usersTaxReturn = new TaxReturn(socialSecurityNumber, lastName,
				firstName, streetAddress, city, zipCode, state, annualIncome,
				isMarried);
		usersTaxReturn.getTaxData();
	}

	public static void main(String[] args)
	{
		prepareTax();

	}
}
