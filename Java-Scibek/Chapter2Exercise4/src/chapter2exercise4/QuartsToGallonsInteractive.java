package chapter2exercise4;

import java.util.Scanner;

public class QuartsToGallonsInteractive
{
	public static void main(String[] args)
	{
		final double QUARTS_IN_A_GALLON = 4.0;
		int quartsNeededForPaintJob;
		Scanner scannerForPaintJobKeyboard = new Scanner(System.in);
		System.out.print("Enter how many quarts you need for the job.");
		final double FIX_ROUND = 0.5;
		quartsNeededForPaintJob = scannerForPaintJobKeyboard.nextInt();
		scannerForPaintJobKeyboard.nextLine();
		scannerForPaintJobKeyboard.close();
		double gallonsNeededForJob =
				quartsNeededForPaintJob / QUARTS_IN_A_GALLON;
		double remainingQuartsNeeded =
				quartsNeededForPaintJob % QUARTS_IN_A_GALLON;
		System.out.printf("The job needs %.0f gallons plus %.0f quarts.",
				gallonsNeededForJob - FIX_ROUND, remainingQuartsNeeded);
	}

}
