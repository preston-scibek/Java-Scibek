package chapter3exercise5;

import java.util.Scanner;

public class Percentages2
{

	/**
	 * prints number one as a percent of number two
	 * @param numberOne - number that will be displayed as a percent of number
	 * two
	 * @param numberTwo - number to be taken percent of
	 */
	public static void computePercent(double numberOne, double numberTwo)
	{
		final int PERCENT = 100;
		System.out.printf("%f is %.0f percent of %f.\n", numberOne,
				(numberOne / numberTwo) * PERCENT, numberTwo);
	}

	public static void main(String[] args)
	{
		Scanner userDoubleKeyboard = new Scanner(System.in);
		double userNumberOne;
		double userNumberTwo;
		System.out.print("Enter the first number.");
		userNumberOne = userDoubleKeyboard.nextDouble();
		System.out.print("Enter the second number.");
		userNumberTwo = userDoubleKeyboard.nextDouble();
		userDoubleKeyboard.close();
		computePercent(userNumberOne, userNumberTwo);
		computePercent(userNumberTwo, userNumberOne);
	}
}
