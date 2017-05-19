package chapter11exercise5;

import static betterutils.BetterUtils.println;

public class NonMetalElement extends Element
{
	/**
	 * builds a non metal element
	 * @param symbol - the symbol
	 * @param atomicNumber - the atomic number
	 * @param atomicWeight - the atomic weight
	 */
	public NonMetalElement(String symbol, int atomicNumber, double atomicWeight)
	{
		super(symbol, atomicNumber, atomicWeight);
	}

	/**
	 * describes the element
	 */
	@Override
	public void describeElement()
	{
		println("Atomic Symbol: %s\nAtomic Number: %d\nAtomic Weight: %.2f"
				+ "\nAtomic Weight: "
				+ "\nDescription: In chemistry, a nonmetal (or non-metal) is"
				+ " a chemical element that mostly lacks metallic attributes"
				+ ". \n\tPhysically, nonmetals tend to be highly volatile "
				+ "(easily vaporised), have low elasticity, \nand are good"
				+ " insulators of heat and electricity;\n\t chemically, "
				+ "they tend to have high ionization energy and "
				+ "electronegativity values,\n\t"
				+ " and gain or share electrons when they "
				+ "react with other elements or compounds.", this.symbol,
				this.atomicNumber, this.atomicWeight);
	}
}
