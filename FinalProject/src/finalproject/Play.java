package finalproject;

import static betterutils.BetterUtils.println;
import java.util.Scanner; 
import finalproject.DoesItHaveLegs;

public class Play
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree("Does it have legs?");
		String userChoice;
		println("Do you want to start a new game or load one?");
		userChoice = keyboard.nextLine().toLowerCase(); // String User Input
		
		switch (userChoice) // Switch Statement
		{
			case "preston is king":
				DoesItHaveLegs.miniGame(keyboard);
				break;
			case "i hate java":
				Python.python(keyboard);
				break;
			default:
				if(userChoice.equalsIgnoreCase("load")) // If Statement
				{
					binaryTree = DoesItHaveLegs.loadTree(); // File Input 
				}
				else
				{
					Node currentNode = binaryTree.getRoot();
					currentNode.setLeft("No");
					currentNode.setRight("Yes");
					currentNode.getRight().setRight("Is it a dog?");
					currentNode.getRight().getRight().setDataType("Dog");
					currentNode.getRight().getRight().setRight("Yes");
					currentNode.getRight().getRight().setLeft("No");
					currentNode.getRight().getRight().getRight()
							.setRight("Yay! I Win! Lets Play Again.");
					currentNode.getRight().getRight().getLeft()
							.setLeft("I give up what is it?");
					currentNode.getLeft().setLeft("Is it a Snake?");
					currentNode.getLeft().getLeft().setDataType("Snake");
					currentNode.getLeft().getLeft().setRight("Yes");
					currentNode.getLeft().getLeft().setLeft("No");
					currentNode.getLeft().getLeft().getRight()
							.setRight("Yay! I Win! Lets Play Again.");
					currentNode.getLeft().getLeft().getLeft()
							.setLeft("I give up what is it?");
				}
				DoesItHaveLegs.game(binaryTree, keyboard);
				break;
		}
		keyboard.close();
	}
}
