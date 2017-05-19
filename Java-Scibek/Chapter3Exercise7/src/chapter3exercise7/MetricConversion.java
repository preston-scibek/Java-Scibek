package chapter3exercise7;

import java.util.Scanner;

public class MetricConversion
{

	/**
	 * converts the number to centimeters
	 * @param numToConvert - number to be converted to centimeters
	 */
	public static void convertToCentimeters(int numToConvert)
	{
		final double CENTIMETERS_PER_INCH = 2.54;
		System.out.printf("%d inches converts to %.3f centimeters.",
				numToConvert, CENTIMETERS_PER_INCH * numToConvert);
	}

	/**
	 * converts number to liters
	 * @param numToConvert - number to be converted to liters
	 */
	public static void convertToLiters(int numToConvert)
	{
		final double LITERS_PER_GALLON = 3.7854;
		System.out.printf("%d gallons converts to %.3f liters.", numToConvert,
				LITERS_PER_GALLON * numToConvert);
	}

	public static void main(String[] args)
	{
		Scanner getIntegerValueKeyboard = new Scanner(System.in);
		int userInt;
		System.out.print("Enter the integer to be converted.");
		userInt = getIntegerValueKeyboard.nextInt();
		convertToCentimeters(userInt);
		convertToLiters(userInt);
		getIntegerValueKeyboard.close();
	}

}
