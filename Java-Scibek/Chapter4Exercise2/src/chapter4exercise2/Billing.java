package chapter4exercise2;

public class Billing
{
	/**
	 * returns price of the bill with a 8 % tax
	 * @param priceOneBook - price one book
	 * @return - price of one book with tax
	 */
	public static double computeBill(double priceOneBook)
	{
		final double TAX = 1.08;
		return priceOneBook * TAX;
	}

	/**
	 * returns price of bill of a quantity of book with 8% tax
	 * @param priceOfBook - price of one book
	 * @param numberOfBookOrdered - quantity ordered
	 * @return - price of bill of all books with tax
	 */
	public static double computeBill(double priceOfBook,
			int numberOfBookOrdered)
	{
		final double TAX = 1.08;
		return (priceOfBook * numberOfBookOrdered) * TAX;
	}

	/**
	 * returns price of bill of a quantity of book with 8% tax and a coupon
	 * value
	 * @param priceOfBook - price of one book
	 * @param numberOfBookOrdered - quantity ordered
	 * @param couponValue - quantity of the coupon
	 * @return - price of bill with 8% tax and coupon
	 */
	public static double computeBill(double priceOfBook,
			int numberOfBookOrdered, double couponValue)
	{
		final double TAX = 1.08;
		return ((priceOfBook * numberOfBookOrdered) - (couponValue)) * TAX;
	}

	public static void main(String[] args)
	{
		final double PRICE_OF_BOOK = 100.00;
		final int NUMBER_OF_BOOK = 20;
		final double COUPON_VALUE = 50.00;
		System.out.printf(
				"The price of the bill for one book at %.2f price "
						+ "is $%.2f.\n",
				PRICE_OF_BOOK, computeBill(PRICE_OF_BOOK));
		System.out.printf(
				"The price of the bill for %d books at %.2f price "
						+ "is $%.2f.\n",
				NUMBER_OF_BOOK, PRICE_OF_BOOK,
				computeBill(PRICE_OF_BOOK, NUMBER_OF_BOOK));
		System.out.printf(
				"The price of the bill for %d books at %.2f price "
						+ "with a $%.2f coupon is $%.2f.\n",
				NUMBER_OF_BOOK, PRICE_OF_BOOK, COUPON_VALUE,
				computeBill(PRICE_OF_BOOK, NUMBER_OF_BOOK, COUPON_VALUE));
	}
}
