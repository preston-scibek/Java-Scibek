package chapter4exercise5;

public class Bread
{
	public static final String MOTTO = "The staff of life";
	private String breadType;
	private double caloriesPerSlice;

	/**
	 * builds a bread class with a breadType, and a caloriesPerSlice
	 * @param typeOfBread - type of bread
	 * @param caloriePerSlice - number of calories per slice
	 */
	public Bread(String typeOfBread, double caloriePerSlice)
	{
		this.breadType = typeOfBread;
		this.caloriesPerSlice = caloriePerSlice;
	}

	/**
	 * returns the type of bread
	 * @return - returns bread type
	 */
	public String getBreadType()
	{
		return this.breadType;
	}

	/**
	 * returns calories per slice
	 * @return - the calories per slice
	 */
	public double getCaloriesPerSlice()
	{
		return this.caloriesPerSlice;
	}
}
