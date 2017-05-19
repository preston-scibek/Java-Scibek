package chapter4exercise5;

public class TestSandwich
{
	public static void main(String[] args)
	{
		Sandwich peanutButterAndJelly =
				new Sandwich("White", "Peanut Butter" + " and Jelly", 150, 120,
						"Peanut Butter and Jelly");
		Sandwich baconLettuceTomato = new Sandwich("Wheat",
				"Bacon Lettuce an" + "d Tomato", 140, 160, "BLT");
		Sandwich phillyCheeseSteak = new Sandwich("Sub roll",
				"Cheese and Ste" + "ak", 200, 300, "Philly Cheese Steak");
		System.out.printf("The %s sandwich uses 2 slices of %s bread at %.2f"
				+ " calories per slice, \nand uses 1 serving of %s filling"
				+ " at %.2f calories per filling,\n"
				+ "for a total of %.2f calorie" + "s.\n The motto is %s.",
				peanutButterAndJelly.getSandwichName(),
				peanutButterAndJelly.getBreadType(),
				peanutButterAndJelly.getBreadCalories(2),
				peanutButterAndJelly.getFillingType(),
				peanutButterAndJelly.getFillingCalories(1),
				peanutButterAndJelly.getBreadCalories(2)
						+ peanutButterAndJelly.getFillingCalories(1),
				Bread.MOTTO);
		System.out.printf("The %s sandwich uses 2 slices of %s bread at %.2f"
				+ " calories per slice, \nand uses 1 serving of %s filling"
				+ " at %.2f calories per filling, \n"
				+ "for a total of %.2f calorie" + "s.\n The motto is %s.",
				baconLettuceTomato.getSandwichName(),
				baconLettuceTomato.getBreadType(),
				baconLettuceTomato.getBreadCalories(2),
				baconLettuceTomato.getFillingType(),
				baconLettuceTomato.getFillingCalories(1),
				baconLettuceTomato.getBreadCalories(2)
						+ baconLettuceTomato.getFillingCalories(1),
				Bread.MOTTO);
		System.out.printf("The %s sandwich uses 2 slices of %s bread at %.2f"
				+ " calories per slice, \nand uses 1 serving of %s filling"
				+ " at %.2f calories per filling, \n"
				+ "for a total of %.2f calorie" + "s. \nThe motto is %s.",
				phillyCheeseSteak.getSandwichName(),
				phillyCheeseSteak.getBreadType(),
				phillyCheeseSteak.getBreadCalories(2),
				phillyCheeseSteak.getFillingType(),
				phillyCheeseSteak.getFillingCalories(1),
				phillyCheeseSteak.getBreadCalories(2)
						+ phillyCheeseSteak.getFillingCalories(1),
				Bread.MOTTO);
	}
}
