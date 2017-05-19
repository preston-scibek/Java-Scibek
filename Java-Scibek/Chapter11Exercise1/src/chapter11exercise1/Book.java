package chapter11exercise1;

public abstract class Book
{
	protected String title;
	protected double price;

	/**
	 * builds book
	 * @param title - title of book
	 */
	public Book(String title)
	{
		this.title = title;
	}

	/**
	 * gets title
	 * @return - the title
	 */
	public String getTitle()
	{
		return this.title;
	}

	/**
	 * gets price
	 * @return - the price
	 */
	public double getPrice()
	{
		return this.price;
	}

	/**
	 * sets the price
	 */
	public abstract void setPrice();

}
