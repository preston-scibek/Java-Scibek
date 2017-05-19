package chapter2exercise6;

import java.util.Scanner;

public class InchesToFeetInteractive
{
	public static void main(String[] args)
	{
		final double INCHES_PER_FOOT = 12.0;
		final double FIX_ROUND = 0.5;
		int inches;
		Scanner scannerForInchesKeyboard = new Scanner(System.in);
		System.out.print("Enter an amount of inches.");
		inches = scannerForInchesKeyboard.nextInt();
		scannerForInchesKeyboard.nextLine();
		scannerForInchesKeyboard.close();
		double feetFromInches = inches / INCHES_PER_FOOT;
		double remainingInches = inches % INCHES_PER_FOOT;
		String result =
				String.format("The result is %.0f feet plus %.0f inch" + "es.",
						feetFromInches - FIX_ROUND, remainingInches);
		System.out.printf(result);

	}
}
