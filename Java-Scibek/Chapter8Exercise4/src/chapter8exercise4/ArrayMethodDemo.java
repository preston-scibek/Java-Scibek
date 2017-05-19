package chapter8exercise4;

public class ArrayMethodDemo
{
	/**
	 * displays array in order
	 * @param array - array to be displayed
	 */
	public static void displayArray(int[] array)
	{
		System.out.println("The array in order is: ");
		int inc = 0;
		for(inc = 0; inc < array.length; inc++)
		{
			System.out.println(array[inc]);
		}
	}

	/**
	 * displays array in reverse order
	 * @param array - array to be displayed
	 */
	public static void displayArrayBackwards(int[] array)
	{

		System.out.println("The array in reverse order is: ");
		int inc = 0;
		for(inc = array.length - 1; inc > -1; inc--)
		{
			System.out.println(array[inc]);
		}
	}

	/**
	 * displays sum of the array
	 * @param array - array to be displayed
	 */
	public static void displaySumArray(int[] array)
	{

		System.out.println("The sum of: ");
		int inc = 0;
		int total = 0;
		for(inc = 0; inc < array.length; inc++)
		{
			if(inc == array.length - 1)
			{
				total += array[inc];
				System.out.print(array[inc] + " = " + total + "\n");
			}
			else
			{
				System.out.print(array[inc] + " + ");
				total += array[inc];
			}
		}
	}

	/**
	 * displays numbers less then maxValue
	 * @param array - array to be displayed
	 * @param maxValue - max value for numbers displayed
	 */
	public static void displayLessThanArray(int[] array, int maxValue)
	{

		System.out.println("The numbers less than " + maxValue + " are: ");
		int inc = 0;
		for(inc = 0; inc < array.length; inc++)
		{
			if(array[inc] >= maxValue)
			{
				continue;
			}
			else
			{
				System.out.println(array[inc]);
			}
		}
	}

	/**
	 * displays numbers greater than the average
	 * @param array - array to be displayed
	 */
	public static void displayGreaterThanAverage(int[] array)
	{
		int inc = 0;
		int total = 0;
		for(inc = 0; inc < array.length; inc++)
		{
			total += array[inc];
		}
		total = total / array.length;
		System.out.println(
				"The numbers greater than the average of " + total + " are: ");
		for(inc = 0; inc < array.length; inc++)
		{
			if(array[inc] > total)
			{
				System.out.println(array[inc]);
			}
			else
			{
				continue;
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arrayOfInts =
				{ 3, 13, 42, 69, 420, 666, 1337, 32, 1, -1 };
		displayArray(arrayOfInts);
		displayArrayBackwards(arrayOfInts);
		displaySumArray(arrayOfInts);
		displayLessThanArray(arrayOfInts, 74);
		displayGreaterThanAverage(arrayOfInts);
	}
}
