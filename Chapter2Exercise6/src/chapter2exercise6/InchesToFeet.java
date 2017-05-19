package chapter2exercise6;

public class InchesToFeet
{
	public static void main(String[] args)
	{
		final double INCHES_PER_FOOT = 12.0;
		int inches = 86;
		double feetFromInches = inches / INCHES_PER_FOOT;
		double remainingInches = inches % INCHES_PER_FOOT;
		String result =
				String.format("The result is %.0f feet plus %.0f inch" + "es.",
						feetFromInches, remainingInches);
		System.out.printf(result);

	}
}
