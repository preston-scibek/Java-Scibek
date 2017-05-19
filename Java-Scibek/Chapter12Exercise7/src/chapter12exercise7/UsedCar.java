package chapter12exercise7;

public class UsedCar
{
	protected int vin;
	protected String make;
	protected int year;
	protected int mileage;
	protected int price;

	/**
	 * builds a used car
	 * @param vin - the vin
	 * @param year - the year
	 * @param mileage - the mileage
	 * @param price - the price
	 * @param make - the make
	 * @throws UsedCarException - error to be thrown
	 */
	public UsedCar(int vin, int year, int mileage, int price, String make)
			throws UsedCarException
	{
		if(String.valueOf(vin).length() != 4)
		{
			throw (new UsedCarException(" vin of " + String.valueOf(vin)));
		}
		else
		{
			this.vin = vin;
		}
		if(!make.equalsIgnoreCase("honda") && !make.equalsIgnoreCase("ford")
				&& !make.equalsIgnoreCase("toyota")
				&& !make.equalsIgnoreCase("chrysler")
				&& !make.equalsIgnoreCase("other"))
		{
			throw (new UsedCarException(" make of " + make));
		}
		else
		{
			this.make = make;
		}
		if(year >= 2014 || year <= 1990)
		{
			throw (new UsedCarException(" year of " + String.valueOf(year)));
		}
		else
		{
			this.year = year;
		}
		if(price < 0)
		{
			throw (new UsedCarException(" price of " + String.valueOf(price)));
		}
		else
		{
			this.price = price;
		}
		if(mileage < 0)
		{
			throw (new UsedCarException(
					" mileage of " + String.valueOf(mileage)));
		}
		else
		{
			this.mileage = mileage;
		}
	}

	/**
	 * makes the car a string
	 * @return - the car to a string
	 */
	public String toString()
	{
		return "VIN: " + this.vin + "\nMAKE: " + this.make + "\nYEAR: "
				+ this.year + "\nMILEAGE: " + this.mileage + "\nPRICE: "
				+ this.price;
	}

}
