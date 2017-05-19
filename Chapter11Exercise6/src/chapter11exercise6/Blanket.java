package chapter11exercise6;

public class Blanket
{
	protected String size;
	protected String color;
	protected String material;
	protected double price;

	/**
	 * builds a blanket
	 */
	public Blanket()
	{
		this.size = "twin";
		this.color = "white";
		this.material = "cotton";
		this.price = 30.00;
	}

	/**
	 * sets the new size
	 * @param newSize - sets the new size
	 */
	public void setSize(String newSize)
	{
		this.size = newSize;
		if(newSize.equalsIgnoreCase("double"))
		{
			this.price += 10.0;
		}
		else if(newSize.equalsIgnoreCase("queen"))
		{
			this.price += 25.00;
		}
		else if(newSize.equalsIgnoreCase("king"))
		{
			this.price += 40.00;
		}
		else
		{
			this.size = "twin";
			this.color = "white";
			this.material = "cotton";
			this.price = 30.00;
		}
	}

	/**
	 * sets the new material
	 * @param newMaterial - sets the new material
	 */
	public void setMaterial(String newMaterial)
	{
		this.material = newMaterial;
		if(newMaterial.equalsIgnoreCase("wool"))
		{
			this.price += 20.0;
		}
		else if(newMaterial.equalsIgnoreCase("cashmere"))
		{
			this.price += 45.00;
		}
		else
		{
			this.size = "twin";
			this.color = "white";
			this.material = "cotton";
			this.price = 30.00;
		}
	}

	/**
	 * sets the new color
	 * @param newColor - new color
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
	}

	/**
	 * makes it a string
	 */
	public String toString()
	{
		return "Size: " + this.size + "\nColor: " + this.color + "\nMaterial: "
				+ this.material + "\nPrice: " + this.price + "\n";

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
	 * gets the size
	 * @return - the size
	 */
	public String getSize()
	{
		return this.size;
	}

	/**
	 * gets the material
	 * @return - the material
	 */
	public String getMaterial()
	{
		return this.material;
	}

	/**
	 * gets the price
	 * @return - the price
	 */
	public double getPrice()
	{
		return this.price;
	}
}
