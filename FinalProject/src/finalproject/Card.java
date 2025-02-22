package finalproject;
// Supporting Class
public class Card
{
	protected String suit;
	protected String value;

	/**
	 * gets the suit
	 * @return - the suit
	 */
	public String getSuit()
	{
		return this.suit;
	}

	/**
	 * gets the value
	 * @return - the value
	 */
	public String getValue()
	{
		return this.value;
	}

	/**
	 * sets the value
	 * @param value - the value
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * sets the suit
	 * @param suit - the suit
	 */
	public void setSuit(String suit)
	{
		this.suit = suit;
	}

	/**
	 * makes the card a string
	 * @return - the card as a string
	 */
	public String toString()
	{
		return this.value + " of " + this.suit;
	}
}
