package chapter10exercise9;

public class IgneousRock extends Rock
{
	/**
	 * builds a rock
	 * @param weight - weight
	 * @param samples - number of samples
	 */
	public IgneousRock(int samples, double weight)
	{
		super(samples, weight);
		this.setDescription("Igneous rock (derived from the Latin word "
				+ "ignis meaning fire)\nis one of the three main rock types,\n"
				+ "the others being sedimentary and metamorphic.\nIgneous rock"
				+ " is formed through the cooling and solidification of magma "
				+ "or lava.");

	}
}
