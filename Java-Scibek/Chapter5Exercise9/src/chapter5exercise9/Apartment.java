package chapter5exercise9;

public class Apartment
{
	protected int apartmentNumber;
	protected int numberOfBedrooms;
	protected double numberOfBaths;
	protected double costOfRent;

	/**
	 * builds an apartment
	 * @param aptNum - the apartment number
	 * @param bedNum - the number of bedrooms
	 * @param bathNum - the number of baths
	 * @param cost - the rent cost
	 */
	public Apartment(int aptNum, int bedNum, double bathNum, double cost)
	{
		this.apartmentNumber = aptNum;
		this.numberOfBedrooms = bedNum;
		this.numberOfBaths = bathNum;
		this.costOfRent = cost;
	}

	/**
	 * gets the apartment number
	 * @return - the apartment number
	 */
	public int getApartmentNumber()
	{
		return this.apartmentNumber;
	}

	/**
	 * sets the apartment number
	 * @param newNumber - the new apartment number
	 */
	public void setApartmentNumber(int newNumber)
	{
		this.apartmentNumber = newNumber;
	}

	/**
	 * gets the number of bedrooms
	 * @return - the number of bedrooms
	 */
	public int getNumberOfBedrooms()
	{
		return this.numberOfBedrooms;
	}

	/**
	 * sets the number of bedrooms
	 * @param newBedrooms - the new number of bedrooms
	 */
	public void setNumberOfBedrooms(int newBedrooms)
	{
		this.numberOfBaths = newBedrooms;
	}

	/**
	 * gets the number of baths
	 * @return - the number of baths
	 */
	public double getNumberOfBaths()
	{
		return this.numberOfBaths;
	}

	/**
	 * sets the number of baths
	 * @param newBaths - the new number of baths
	 */
	public void setNumberOfBaths(double newBaths)
	{
		this.numberOfBaths = newBaths;
	}

	/**
	 * gets the cost to rent
	 * @return - the cost to rent
	 */
	public double getCostOfRent()
	{
		return this.costOfRent;
	}

	/**
	 * sets the cost to rent
	 * @param newCost - the new cost to rent
	 */
	public void setCostOfRent(double newCost)
	{
		this.costOfRent = newCost;
	}
}
