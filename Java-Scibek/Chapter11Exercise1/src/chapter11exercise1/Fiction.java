package chapter11exercise1;

public class Fiction extends Book
{

	/**
	 * builds a fiction book
	 * @param title - the title
	 */
	public Fiction(String title)
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
		this.price = 24.99;
	}

}
