package chapter4exercise5;

public class SandwichFilling
{
	private String fillingType;
	private double caloriesPerServing;

	/**
	 * builds a sandwich filling class and assigns it a type and number of
	 * calories
	 * @param typeOfFilling - type of the filling
	 * @param caloriePerServing - number of calories per serving
	 */
	public SandwichFilling(String typeOfFilling, double caloriePerServing)
	{
		this.fillingType = typeOfFilling;
		this.caloriesPerServing = caloriePerServing;
	}

	/**
	 * gets the filling type
	 * @return - returns the filling type
	 */
	public String getFillingType()
	{
		return this.fillingType;
	}

	/**
	 * gets the number of calories per serving
	 * @return - the calories per serving
	 */
	public double getCaloriesPerServing()
	{
		return this.caloriesPerServing;
	}
}
