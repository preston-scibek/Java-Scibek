package chapter11exercise5;

public abstract class Element
{
	protected String symbol;
	protected int atomicNumber;
	protected double atomicWeight;

	/**
	 * builds a element
	 * @param symbol - the symbol
	 * @param atomicNumber - the number
	 * @param atomicWeight - the weight
	 */
	public Element(String symbol, int atomicNumber, double atomicWeight)
	{
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
	}

	/**
	 * get the atomic symbol
	 * @return - the symbol
	 */
	public String getSymbol()
	{
		return this.symbol;
	}

	/**
	 * get the atomic Number
	 * @return - the atomic number
	 */
	public int getAtomicNumber()
	{
		return this.atomicNumber;
	}

	/**
	 * get the atomic weight
	 * @return - the weight
	 */
	public double getAtomicWeight()
	{
		return this.atomicWeight;
	}

	public abstract void describeElement();
}
