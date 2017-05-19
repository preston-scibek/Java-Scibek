package chapter3exercise4;

import java.util.Scanner;

public class NumbersDemo2
{

	/**
	 * displays the number doubled
	 * @param numberToBeDisplayed - number to be doubled
	 */
	public static void displayTwiceTheNumber(int numberToBeDisplayed)
	{
		final int TWICE = 2;
		int twiceTheNumber = numberToBeDisplayed * TWICE;
		System.out.printf("%d doubled is %d.\n", numberToBeDisplayed,
				twiceTheNumber);
	}

	/**
	 * displays the number plus five
	 * @param numberToBeDisplayed - number to be added with 5
	 */
	public static void displayNumberPlusFive(int numberToBeDisplayed)
	{
		final int FIVE = 5;
		int numberPlusFive = numberToBeDisplayed + FIVE;
		System.out.printf("%d + %d is %d.\n", numberToBeDisplayed, FIVE,
				numberPlusFive);
	}

	/**
	 * displays a number squared
	 * @param numberToBeDisplayed - number to be squared
	 */
	public static void displayNumberSquared(int numberToBeDisplayed)
	{
		double numberSquared = Math.pow(numberToBeDisplayed, 2.0);
		System.out.printf("%d squared is %.0f.\n", numberToBeDisplayed,
				numberSquared);
	}

	public static void main(String[] args)
	{
		Scanner getIntsKeyboard = new Scanner(System.in);
		int userNumberOne;
		int userNumberTwo;
		System.out.print("Enter the first number.");
		userNumberOne = getIntsKeyboard.nextInt();
		getIntsKeyboard.nextLine();
		System.out.print("\nEnter the second number.");
		userNumberTwo = getIntsKeyboard.nextInt();
		getIntsKeyboard.close();
		System.out.print("\n");
		displayNumberPlusFive(userNumberOne);
		displayNumberSquared(userNumberOne);
		displayTwiceTheNumber(userNumberOne);
		displayNumberPlusFive(userNumberTwo);
		displayNumberSquared(userNumberTwo);
		displayTwiceTheNumber(userNumberTwo);
	}
}
