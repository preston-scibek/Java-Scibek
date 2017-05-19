package chapter4exercise5;

public class TestSandwichFilling
{
	public static void main(String[] args)
	{
		SandwichFilling eggSalad = new SandwichFilling("Egg salad", 430);
		SandwichFilling turkeyAndCheese =
				new SandwichFilling("Turkey and" + " Cheese", 350);
		SandwichFilling baconLettuceTomato =
				new SandwichFilling("Bacon " + "Lettuce and Tomato", 500);
		System.out.printf(
				"%s sandwich filling has %.2f calories per serving" + ".\n",
				turkeyAndCheese.getFillingType(),
				turkeyAndCheese.getCaloriesPerServing());
		System.out.printf(
				"%s sandwich filling has %.2f calories per serving" + ".\n",
				eggSalad.getFillingType(), eggSalad.getCaloriesPerServing());
		System.out.printf(
				"%s sandwich filling has %.2f calories per serving" + ".\n",
				baconLettuceTomato.getFillingType(),
				baconLettuceTomato.getCaloriesPerServing());
		System.out.print(eggSalad);
	}
}
