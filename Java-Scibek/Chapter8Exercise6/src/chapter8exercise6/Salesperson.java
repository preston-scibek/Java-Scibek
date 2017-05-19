package chapter8exercise6;

public class Salesperson
{
	private int idNumber;
	private double salesAmount;

	/**
	 * makes a sales person
	 * @param numberID - id for sales person
	 * @param amountOfSales - number of sales
	 */
	public Salesperson(int numberID, double amountOfSales)
	{
		this.idNumber = numberID;
		this.salesAmount = amountOfSales;
	}

	/**
	 * gets the id number of current salesperson
	 * @return - returns id of current person
	 */
	public int getIDNumber()
	{
		return this.idNumber;
	}

	/**
	 * gets sales amount of current person
	 * @return - the current sales amount for current person
	 */
	public double getSales()
	{
		return this.salesAmount;
	}

	/**
	 * sets a new id number
	 * @param newIDNumber - new id
	 */
	public void setIDNumber(int newIDNumber)
	{
		this.idNumber = newIDNumber;
	}

	/**
	 * sets a new sales amount
	 * @param newSalesAmount - new sales amount
	 */
	public void setSalesAmout(double newSalesAmount)
	{
		this.salesAmount = newSalesAmount;
	}
}
