package chapter10exercise3;

public class ItemSold
{
	private int invoiceNumber;
	private String description;
	private double price;

	public ItemSold(int invoiceNumber, String description, double price)
	{
		this.invoiceNumber = invoiceNumber;
		this.description = description;
		this.price = price;
	}

	/**
	 * gets the invoice number
	 * @return - the invoiceNumber
	 */
	public int getInvoiceNumber()
	{
		return this.invoiceNumber;
	}

	/**
	 * sets the invoice number
	 * @param invoiceNumber - the invoiceNumber to set
	 */
	public void setInvoiceNumber(int invoiceNumber)
	{
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * gets the description
	 * @return - the description
	 */
	public String getDescription()
	{
		return this.description;
	}

	/**
	 * sets the description
	 * @param description - description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * gets the price
	 * @return - the price
	 */
	public double getPrice()
	{
		return this.price;
	}

	/**
	 * sets the price
	 * @param price - the price to set
	 */
	public void setPrice(int price)
	{
		this.price = price;
	}

}
