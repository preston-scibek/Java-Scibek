package chapter2exercise4;

public class QuartsToGallons
{
	public static void main(String[] args)
	{
		final double QUARTS_IN_A_GALLON = 4.0;
		final double FIX_ROUND = 0.5;
		int quartsNeededForPaintJob;
		quartsNeededForPaintJob = 18;
		double gallonsNeededForJob =
				(quartsNeededForPaintJob / QUARTS_IN_A_GALLON);
		double remainingQuartsNeeded =
				quartsNeededForPaintJob % QUARTS_IN_A_GALLON;
		System.out.printf("The job needs %.0f gallons plus %.0f quarts.",
				gallonsNeededForJob - FIX_ROUND, remainingQuartsNeeded);
	}

}
