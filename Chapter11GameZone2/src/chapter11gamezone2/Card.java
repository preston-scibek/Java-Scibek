package chapter11gamezone2;

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
}
