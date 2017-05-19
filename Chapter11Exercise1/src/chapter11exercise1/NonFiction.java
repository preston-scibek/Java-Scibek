package chapter11exercise1;

public class NonFiction extends Book
{
	/**
	 * builds a non fiction book
	 * @param title - the title
	 */
	public NonFiction(String title)
	{
		super(title);
		this.setPrice();
	}

	/**
	 * sets the price
	 */
	@Override
	public void setPrice()
	{
		this.price = 37.99;
	}
}
