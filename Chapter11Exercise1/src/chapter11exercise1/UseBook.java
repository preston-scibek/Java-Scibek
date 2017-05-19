package chapter11exercise1;

import static betterutils.BetterUtils.*;

public class UseBook
{
	/**
	 * demos the books
	 */
	public static void demoBooks()
	{
		Fiction harryPotter =
				new Fiction("Harry Potter and the " + "Prisoner of Askaban");
		NonFiction bible = new NonFiction("Bible");
		println("\tFiction\nTitle: %s\nPrice: $%.2f", harryPotter.getTitle(),
				harryPotter.getPrice());
		println("\tNon-Fiction\nTitle: %s\nPrice: $%.2f", bible.getTitle(),
				bible.getPrice());
	}

	public static void main(String[] args)
	{
		demoBooks();
	}
}
