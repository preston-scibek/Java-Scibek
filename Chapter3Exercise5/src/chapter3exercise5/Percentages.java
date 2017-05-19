package chapter3exercise5;

public class Percentages
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
		double firstNumber = 20;
		double secondNumber = 100;
		computePercent(firstNumber, secondNumber);
		computePercent(secondNumber, firstNumber);
	}
}
