package chapter11exercise6;

import static betterutils.BetterUtils.*;

public class DemoBlankets
{
	/**
	 * demos the blankets
	 */
	public static void demoBlankets()
	{
		Blanket normal = new Blanket();
		ElectricBlanket electricBlanket = new ElectricBlanket();
		println(normal.toString());
		normal.setColor("red");
		println(normal.toString());
		normal.setMaterial("cashmere");
		println(normal.toString());
		normal.setSize("queen");
		println(normal.toString());
		println(electricBlanket.toString());
		electricBlanket.setColor("red");
		println(electricBlanket.toString());
		electricBlanket.setMaterial("wool");
		println(electricBlanket.toString());
		electricBlanket.setSize("king");
		println(electricBlanket.toString());
		electricBlanket.setHeatSettings(3);
		println(electricBlanket.toString());
		electricBlanket.setAutoShutOff(true);
		println(electricBlanket.toString());
	}

	public static void main(String[] args)
	{
		demoBlankets();
	}
}
