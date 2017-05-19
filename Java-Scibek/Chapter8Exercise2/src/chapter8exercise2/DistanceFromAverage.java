package chapter8exercise2;

import java.util.Scanner;

public class DistanceFromAverage
{
	/**
	 * calculates distance from average of each number
	 */
	public static void calcDistance()
	{
		final int LEN_LIST = 20;
		double[] averageNumberList = new double[LEN_LIST];
		int inc = 0;
		Scanner keyboardUser = new Scanner(System.in);
		int count = 0;
		double total = 0;
		double currentNumber = 0;
		for(inc = 0; inc < LEN_LIST; inc++)
		{
			System.out.print("\nEnter a number to be included in the list"
					+ " or enter 99999 to stop: ");
			currentNumber = keyboardUser.nextDouble();
			keyboardUser.nextLine();
			if(currentNumber == 99999.0)
			{
				if(inc == 0)
				{
					System.out.print("Error you not enter none numbers... ");
					keyboardUser.close();
					return;
				}
				else
				{
					break;
				}
			}
			else
			{
				averageNumberList[inc] = currentNumber;
				total += currentNumber;
				count++;
			}
		}
		for(inc = 0; inc < count; inc++)
		{
			System.out.printf("\n%.2f is %.2f from the average of %.2f.",
					averageNumberList[inc],
					averageNumberList[inc] - total / count, total / count);
		}
		keyboardUser.close();
	}

	public static void main(String[] args)
	{
		calcDistance();
	}
}
