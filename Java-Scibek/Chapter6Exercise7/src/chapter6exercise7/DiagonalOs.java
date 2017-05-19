package chapter6exercise7;

import static betterutils.BetterUtils.*;

public class DiagonalOs
{
	public static void main(String[] args)
	{
		final int DIAGONAL_LENGTH = 10;
		String spaces = "";
		for(int i = 0; i < DIAGONAL_LENGTH; i++)
		{
			println(spaces + "O");
			spaces += " ";
		}
	}
}
