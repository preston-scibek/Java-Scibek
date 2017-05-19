package chapter4exercise5;

public class Sandwich
{
	private String sandwichName;
	private Bread sandwichBread;
	private SandwichFilling fillingForSandwich;

	/**
	 * builds a sandwich class, builds a bread class, builds a filling class,
	 * assigns the bread and filling to the sandwich
	 * @param breadType - type of bread to be used
	 * @param fillingType - type of filling to be used
	 * @param breadCalorie - number of calories per slice of bread
	 * @param fillingCalorie - number of calories per serving of filling
	 * @param nameOfSandwich - name of the sandwich
	 */
	public Sandwich(String breadType, String fillingType, double breadCalorie,
			double fillingCalorie, String nameOfSandwich)
	{
		this.sandwichBread = new Bread(breadType, breadCalorie);
		this.fillingForSandwich =
				new SandwichFilling(fillingType, fillingCalorie);
		this.sandwichName = nameOfSandwich;
	}

	/**
	 * gets the sandwich filling
	 * @return - returns the filling for sandwich
	 */
	public SandwichFilling getSandwichFilling()
	{
		return this.fillingForSandwich;
	}

	/**
	 * gets the filling type
	 * @return - the filing type
	 */
	public String getFillingType()
	{
		return this.fillingForSandwich.getFillingType();
	}

	/**
	 * gets the bread type
	 * @return - returns the bread type
	 */
	public String getBreadType()
	{
		return this.sandwichBread.getBreadType();
	}

	/**
	 * gets the sandwich bread
	 * @return - returns the sandwich bread
	 */
	public Bread getBread()
	{
		return this.sandwichBread;
	}

	/**
	 * returns the number of calories in the sandwich bread
	 * @param numberOfSlices - number of slices used
	 * @return - calories in the sandwich bread slices
	 */
	public double getBreadCalories(int numberOfSlices)
	{
		return this.sandwichBread.getCaloriesPerSlice() * numberOfSlices;
	}

	/**
	 * returns the calories of the sandwich filling
	 * @param numberOfServings - servings of filling
	 * @return - returns the number of calories total of the filling servings
	 */
	public double getFillingCalories(int numberOfServings)
	{
		return this.fillingForSandwich.getCaloriesPerServing()
				* numberOfServings;
	}

	/**
	 * get the name of the sandwich
	 * @return - the name of the sandwich
	 */
	public String getSandwichName()
	{
		return this.sandwichName;
	}
}
