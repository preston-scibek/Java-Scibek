package chapter2exercise8;

import java.util.Scanner;

public class Eggs
{
	public static void main(String[] args)
	{
		Scanner scannerForEggsKeyboard = new Scanner(System.in);
		final double COST_PER_DOZEN = 3.25;
		final double COST_PER_EGG = .45;
		final int DOZEN = 12;
		System.out.print("How many eggs are you going to order?");
		int numberOfEggs = scannerForEggsKeyboard.nextInt();
		double numberOfDozen = (numberOfEggs / DOZEN);
		double numberOfSingle = (numberOfEggs % DOZEN);
		double costOfDozens = numberOfDozen * COST_PER_DOZEN;
		double costOfSingles = numberOfSingle * COST_PER_EGG;
		double total = costOfDozens + costOfSingles;
		String result = String.format(
				"Your ordered %d eggs. That's %.0f doze"
						+ "n at %.2f per dozen and %.0f loose eggs at %.2f dollars"
						+ " each " + "for a total of $%.2f.",
				numberOfEggs, numberOfDozen, COST_PER_DOZEN, numberOfSingle,
				COST_PER_EGG, total);
		System.out.print(result);
		scannerForEggsKeyboard.close();

	}

}
