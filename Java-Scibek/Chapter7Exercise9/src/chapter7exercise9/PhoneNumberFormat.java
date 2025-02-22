
package chapter7exercise9;

import java.util.Scanner;

public class PhoneNumberFormat
{
	/**
	 * formats a phone number into (###) ###-###
	 * @param phoneNumberUnFormat - phone number in from of ##########
	 */
	public static void phoneNumFormatter(String phoneNumberUnFormat)
	{
		if(phoneNumberUnFormat.length() != 10)
		{
			System.out.println("Error!!!");
		}
		else
		{

			StringBuilder fixPhoneNum = new StringBuilder();
			fixPhoneNum.append(phoneNumberUnFormat);
			fixPhoneNum.insert(0, "(");
			fixPhoneNum.insert(4, ") ");
			fixPhoneNum.insert(9, "-");
			System.out.printf("The phone number is %s.\n", fixPhoneNum);
		}
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		System.out.print("Enter a 10 digit phone number: ");
		userInput = keyboard.nextLine();
		while(!userInput.equals("999"))
		{
			phoneNumFormatter(userInput);
			System.out.print("Enter a 10 digit phone number or 999 to exit: ");
			userInput = keyboard.nextLine();
		}
		keyboard.close();
	}
}
