package chapter11exercise1;

import static betterutils.BetterUtils.*;

public class BookArray
{
	/**
	 * displays the books
	 * @param library - the book library
	 */
	public static void displayBooks(Book[] library)
	{
		for(int i = 0; i < library.length; i++)
		{
			println("Title: %s Cost: $%.2f", library[i].title,
					library[i].getPrice());
		}
	}

	public static void main(String[] args)
	{
		Book[] library =
				{ new Fiction("Percy Jackson"), new NonFiction("Bible"),
						new Fiction("Harry Potter"),
						new NonFiction("How To Program"),
						new Fiction("Nick's Work"),
						new NonFiction("How to Life"), new Fiction("Catalyst"),
						new NonFiction("Star Wars"),
						new Fiction("Hunger Games"),
						new NonFiction("Star Trek") };
		displayBooks(library);
	}
}
