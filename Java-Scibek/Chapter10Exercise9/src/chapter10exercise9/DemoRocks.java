package chapter10exercise9;

import static betterutils.BetterUtils.*;
import java.util.Random;

public class DemoRocks
{
	/**
	 * demos the rocks
	 */
	public static void demoRocks()
	{
		Random rand = new Random();
		Rock basicRock = new Rock(rand.nextInt(10), rand.nextDouble());
		IgneousRock igRock =
				new IgneousRock(rand.nextInt(10), rand.nextDouble());
		SedimentaryRock sedRock =
				new SedimentaryRock(rand.nextInt(10), rand.nextDouble());
		MetamorphicRock metRock =
				new MetamorphicRock(rand.nextInt(10), rand.nextDouble());
		println("\tROCK\nDescription: %s\nNumber of "
				+ "Samples: %d\nWeight in Grams: %.2f grams",
				basicRock.getDescription(), basicRock.getNumberOfSamples(),
				basicRock.getWeightInGrams());
		println("\tROCK\nDescription: %s\nNumber of "
				+ "Samples: %d\nWeight in Grams: %.2f grams",
				igRock.getDescription(), igRock.getNumberOfSamples(),
				igRock.getWeightInGrams());
		println("\tROCK\nDescription: %s\nNumber of "
				+ "Samples: %d\nWeight in Grams: %.2f grams",
				sedRock.getDescription(), sedRock.getNumberOfSamples(),
				sedRock.getWeightInGrams());
		println("\tROCK\nDescription: %s\nNumber of "
				+ "Samples: %d\nWeight in Grams: %.2f grams",
				metRock.getDescription(), metRock.getNumberOfSamples(),
				metRock.getWeightInGrams());
	}

	public static void main(String[] args)
	{
		demoRocks();
	}
}
