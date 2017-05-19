package chapter9exercise1;

public class StringSort
{
	/**
	 * sorts a list of strings
	 * @param listOfWords - list of strings to be sorted
	 */
	public static void sortList(String[] listOfWords)
	{
		int inc = 0;
		int incTwo = 0;
		String tempString;
		for(inc = 0; inc < listOfWords.length - 1; inc++)
		{
			for(incTwo = 0; incTwo < listOfWords.length - 1; incTwo++)
			{
				if(listOfWords[incTwo]
						.compareToIgnoreCase(listOfWords[incTwo + 1]) > 0)
				{
					tempString = listOfWords[incTwo];
					listOfWords[incTwo] = listOfWords[incTwo + 1];
					listOfWords[incTwo + 1] = tempString;
				}
			}
		}
		for(inc = 0; inc < listOfWords.length; inc++)
		{
			System.out.println(listOfWords[inc]);
		}
	}

	public static void main(String[] args)
	{
		String[] listOfWords =
				{ "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i",
						"h", "g", "f", "e", "d", "c", "b", "a" };
		sortList(listOfWords);
	}
}
