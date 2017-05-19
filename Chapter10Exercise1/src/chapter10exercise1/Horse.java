package chapter10exercise1;

public class Horse
{
	private String name;
	private String color;
	private String birthYear;

	/**
	 * builds a horse
	 * @param name - name of new horse
	 * @param color - color of new horse
	 * @param birthYear - birth year of new horse
	 */
	public Horse(String name, String color, String birthYear)
	{
		this.name = name;
		this.color = color;
		this.birthYear = birthYear;
	}

	/**
	 * gets the name
	 * @return - the name
	 */

	public String getName()
	{
		return this.name;
	}

	/**
	 * sets the name
	 * @param name - name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * gets the color
	 * @return - the color
	 */
	public String getColor()
	{
		return this.color;
	}

	/**
	 * sets the color
	 * @param color - color the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * gets the birth year
	 * @return the birthYear
	 */
	public String getBirthYear()
	{
		return this.birthYear;
	}

	/**
	 * sets the birth year
	 * @param birthYear - the birthYear to set
	 */
	public void setBirthYear(String birthYear)
	{
		this.birthYear = birthYear;
	}

}
