package chapter10exercise9;

public class SedimentaryRock extends Rock
{
	/**
	 * builds a rock
	 * @param weight - weight
	 * @param samples - number of samples
	 */
	public SedimentaryRock(int samples, double weight)
	{
		super(samples, weight);
		this.setDescription("Sedimentary rocks are types of rock "
				+ "that are formed by the \ndeposition of material at the"
				+ " Earth's surface and within bodies of water.");

	}
}
