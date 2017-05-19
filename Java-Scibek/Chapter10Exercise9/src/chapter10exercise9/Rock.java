package chapter10exercise9;

public class Rock
{
	private int numberOfSamples;
	private String description;
	private double weightInGrams;

	/**
	 * builds a rock
	 * @param samples - number of samples
	 * @param weight - weight in grams
	 */
	public Rock(int samples, double weight)
	{
		this.description = "Unclassified";
		this.weightInGrams = weight;
		this.numberOfSamples = samples;
	}

	/**
	 * get the numberOfSamples
	 * @return - the numberOfSamples
	 */
	public int getNumberOfSamples()
	{
		return numberOfSamples;
	}

	/**
	 * set the numberOfSamples
	 * @param numberOfSamples - the numberOfSamples to set
	 */
	public void setNumberOfSamples(int numberOfSamples)
	{
		this.numberOfSamples = numberOfSamples;
	}

	/**
	 * get the description
	 * @return - the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * set the description
	 * @param description - the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * get the weightInGrams
	 * @return - the weightInGrams
	 */
	public double getWeightInGrams()
	{
		return weightInGrams;
	}

	/**
	 * set the weightInGrams
	 * @param weightInGrams the weightInGrams to set
	 */
	public void setWeightInGrams(double weightInGrams)
	{
		this.weightInGrams = weightInGrams;
	}
}
