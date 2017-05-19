package chapter11exercise5;

import static betterutils.BetterUtils.*;

public class MetalElement extends Element
{

	/**
	 * builds a metal element
	 * @param symbol - the symbol
	 * @param atomicNumber - the atomic number
	 * @param atomicWeight - the atomic weight
	 */
	public MetalElement(String symbol, int atomicNumber, double atomicWeight)
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
				+ "\nDescription: A metal is a element \n\t that is typic"
				+ "ally hard, opaque, shiny,"
				+ " and has good electrical and thermal conductivity.\n\t"
				+ " Metals are generally malleable — that is, they can be"
				+ " hammered or pressed permanently out of shape\n\t without"
				+ " breaking or cracking — \n\tas well as fusible ("
				+ "able to be fused or melted) and ductile "
				+ "(able to be drawn out into a thin wire).", this.symbol,
				this.atomicNumber, this.atomicWeight);
	}

}
