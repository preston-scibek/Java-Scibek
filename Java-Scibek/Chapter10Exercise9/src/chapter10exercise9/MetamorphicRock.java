package chapter10exercise9;

public class MetamorphicRock extends Rock
{
	/**
	 * builds a rock
	 * @param weight - weight
	 * @param samples - number of samples
	 */
	public MetamorphicRock(int samples, double weight)
	{
		super(samples, weight);
		this.setDescription("A metamorphic rock is a result "
				+ "of a transformation \n"
				+ "of a pre-existing rock.\n"
				+ "The original rock is subjected to very high heat and "
				+ "pressure,\nwhich cause obvious physical and/or chemical "
				+ "changes.\nExamples of these rock types include: marble, "
				+ "slate, gneiss, schist.");

	}
}
