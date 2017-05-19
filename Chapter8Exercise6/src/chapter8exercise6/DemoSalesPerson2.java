package chapter8exercise6;

public class DemoSalesPerson2
{
	/**
	 * set up an array of sales people with increasing values
	 */
	public static void setupSalesArray()
	{
		Salesperson[] salespersonArray;
		salespersonArray = new Salesperson[10];
		int inc = 0;
		final int DEFAULT_ID = 111;
		final double DEFAULT_SALES = 25000;
		final double SALES_INCREASE = 5000;
		for(inc = 0; inc < salespersonArray.length; inc++)
		{
			salespersonArray[inc] = new Salesperson(DEFAULT_ID + inc,
					DEFAULT_SALES + (SALES_INCREASE * inc));
		}
		for(inc = 0; inc < salespersonArray.length; inc++)
		{
			System.out.println("SalesPerson " + inc + " has id #: "
					+ salespersonArray[inc].getIDNumber()
					+ " and a sales amount number: "
					+ salespersonArray[inc].getSales());
		}
	}

	public static void main(String[] args)
	{
		setupSalesArray();
	}
}
