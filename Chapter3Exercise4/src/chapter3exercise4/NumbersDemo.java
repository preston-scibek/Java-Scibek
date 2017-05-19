package chapter3exercise4;

public class NumbersDemo
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
		int numberOne = 15;
		int numberTwo = 25;
		displayTwiceTheNumber(numberOne);
		displayTwiceTheNumber(numberTwo);
		displayNumberPlusFive(numberOne);
		displayNumberPlusFive(numberTwo);
		displayNumberSquared(numberOne);
		displayNumberSquared(numberTwo);

	}
}
