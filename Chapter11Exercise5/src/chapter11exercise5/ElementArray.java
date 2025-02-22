package chapter11exercise5;

public class ElementArray
{
	/**
	 * demos the elements
	 */
	public static void demoElements()
	{
		MetalElement[] metalList = new MetalElement[3];
		metalList[0] = new MetalElement("Fe", 26, 55.845);
		metalList[1] = new MetalElement("Co", 27, 58.933194);
		metalList[2] = new MetalElement("Cu", 29, 63.546);
		NonMetalElement[] nonMetalList = new NonMetalElement[3];
		nonMetalList[0] = new NonMetalElement("C", 6, 12.011);
		nonMetalList[1] = new NonMetalElement("O", 7, 14.007);
		nonMetalList[2] = new NonMetalElement("N", 8, 15.999);
		for(int i = 0; i < metalList.length; i++)
		{
			metalList[i].describeElement();
		}
		for(int i = 0; i < metalList.length; i++)
		{
			nonMetalList[i].describeElement();
		}
	}

	public static void main(String[] args)
	{
		demoElements();
	}
}
