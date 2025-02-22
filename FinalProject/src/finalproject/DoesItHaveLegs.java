package finalproject;
// Supporting Class
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.Random; 
import java.util.Scanner; 
import static betterutils.BetterUtils.*;

public class DoesItHaveLegs
{
	/**
	 * loads a previous binary tree
	 * @return - binary tree
	 */
	public static BinaryTree loadTree() // File Input
	{
		try
		{

			FileInputStream fileInput = new FileInputStream("binaryTree.ser");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput); 
			BinaryTree binaryTree = (BinaryTree) objectInput.readObject();
			objectInput.close();
			return binaryTree;

		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * saves a binary tree
	 * @param binaryTree - binary tree to be saved
	 */
	public static void saveTree(BinaryTree binaryTree) // File Output
	{
		try
		{

			FileOutputStream fileOut = new FileOutputStream("binaryTree.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(binaryTree);
			objectOut.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * evolving computer game where the computer learns...
	 * @param binaryTree - class of binary tree for computer to learn in
	 * @param keyboard - scanner keyboard so i can close the keyboard
	 * @return - returns itself or null to keep learning
	 */
	public static Object game(BinaryTree binaryTree, Scanner keyboard)
	{
		String userChoice;
		Node currentNode = binaryTree.getRoot();
		String data;
		String newAnimal;
		String oldAnimal;
		while(true) // Loop 4
		{
			try
			{
				data = currentNode.getData();
				if(data.equalsIgnoreCase("yes")) // If Statement
				{
					currentNode = currentNode.getRight();
				}
				else if(data.equalsIgnoreCase("no"))
				{
					currentNode = currentNode.getLeft();
				}
				else if(data.equalsIgnoreCase("Yay! I Win! Lets Play Again."))
				{
					println(currentNode.getData());
					while(currentNode.getIsRoot() == false) // Loop 5
					{
						currentNode = currentNode.getParent();
					}
					binaryTree.setRoot(currentNode);
					return game(binaryTree, keyboard);
				}
				else if(data.equalsIgnoreCase("I give up what is it?"))
				{
					println(currentNode.getData());
					newAnimal = keyboard.nextLine();
					currentNode = currentNode.getParent().getParent();
					println("What is a question where the answer "
							+ "is yes for %s and no for %s.", newAnimal,
							currentNode.getDataType());
					oldAnimal = currentNode.getDataType();
					userChoice = keyboard.nextLine(); // String User Input
					currentNode.setData(userChoice);
					currentNode.setLeft("No");
					currentNode.getLeft().setLeft("Is it a " + 
							oldAnimal + "?");
					currentNode.getLeft().getLeft().setDataType(oldAnimal);
					currentNode = currentNode.getLeft();
					currentNode.getLeft().setLeft("No");
					currentNode.getLeft().getLeft()
							.setLeft("I " + "give up what is it?");
					currentNode = currentNode.getParent();
					currentNode.setRight("Yes");
					currentNode = currentNode.getRight();
					currentNode.setRight("Is it a " + newAnimal + "?");
					currentNode.getRight().setDataType(newAnimal);
					currentNode = currentNode.getRight();
					currentNode.setRight("Yes");
					currentNode.setLeft("No");
					currentNode.getRight()
							.setRight("Yay! I Win! Lets Play" + " Again.");
					currentNode.getLeft().setLeft("I give up what is it?");
					while(currentNode.getIsRoot() == false) // Loop 6
					{

						currentNode = currentNode.getParent();
					}
					binaryTree.setRoot(currentNode);
					return game(binaryTree, keyboard);
				}
				else
				{
					println(currentNode.getData());
					userChoice = keyboard.nextLine(); // String User Input
					if(userChoice.equalsIgnoreCase("tree")) // If Statement
					{
						while(currentNode.getIsRoot() == false) // Loop 7
						{
							currentNode = currentNode.getParent();
						}
						binaryTree.setRoot(currentNode);
						// binaryTree.printTree();
						binaryTree.buildTree();
						return null;
					}
					else if(userChoice.equalsIgnoreCase("quit"))
					{
						Random rand = new Random(); // Implements Random
						int random = rand.nextInt(10) + 1;
						if(random >= 5) // If Statement
						{
							println("Noooooooo, hrhgh-h.. helppppp hraguh"
									+ ".. your kill"
									+ "ing hrhghhg.. me... aaaarrrgghhhhh"
									+ "....");
							smallFlatline();
						}
						return null;
					}
					else if(userChoice.equalsIgnoreCase("save"))
					{
						while(currentNode.getIsRoot() == false) // Loop 8
						{

							currentNode = currentNode.getParent();
						}
						binaryTree.setRoot(currentNode);
						binaryTree.buildTree();
						saveTree(binaryTree); // File Output
						return null;
					}
					currentNode = currentNode.whichChild(userChoice);
				}
			}
			catch(Exception e)
			{
				Random rand = new Random(); // Implements Random
				int random = rand.nextInt(10) + 1;
				if(random >= 5) // If Statement
				{
					println("Sorry, but there was some null error.");
				}
				else
				{
					println("Noooooooo, hrhgh-h.. helppppp hraguh.. your kill"
							+ "ing hrhghhg.. me... aaaarrrgghhhhh....");
					smallFlatline();
				}

				int errorTrace = keyboard.nextInt();
				if(errorTrace == 1) // If Statement
				{
					e.printStackTrace();
				}
				return null;
			}
		}
	}

	/**
	 * plays miniGames
	 * @param keyboard - the keyboard used through the game
	 */
	public static void miniGame(Scanner keyboard)
	{
		println("Do you want a random game('random') or to chose: ");
		String userChoice = keyboard.nextLine(); // String User Input
		if(userChoice.equalsIgnoreCase("random")) // If Statement
		{
			Random rand = new Random(); // Implements Random
			if(rand.nextBoolean()) // If Statement
			{
				RockPaperScissors fun = new RockPaperScissors();
				fun.rules();
				fun.beginGame(keyboard);
			}
			else if(rand.nextBoolean())
			{
				Poker fun = new Poker();
				fun.displayDescription();
				fun.rules();
				fun.play();
			}
			else
			{
				BlackJack fun = new BlackJack();
				fun.displayDescription();
				fun.rules();
				fun.deal();
				println("Do you want to hit or stay");
				userChoice = keyboard.nextLine().toLowerCase(); 
											// String User Input
				boolean bust = true;
				while(userChoice.equals("hit") && bust) // Loop 9
				{
					bust = fun.hit();
					println("Do you want to hit or stay");
					userChoice = keyboard.nextLine().toLowerCase();
				}
				fun.stay();
			}
		}
		else
		{
			println("Do you want to play RPS, blackjack, or poker: ");
			userChoice = keyboard.nextLine().toLowerCase(); 
									// String User Input
			switch (userChoice) // Switch Statement
			{
				case "rps":
					RockPaperScissors fun = new RockPaperScissors();
					fun.rules();
					fun.beginGame(keyboard);
					break;
				case "blackjack":
					BlackJack blackJackFun = new BlackJack();
					blackJackFun.displayDescription();
					blackJackFun.rules();
					blackJackFun.deal();
					println("Do you want to hit or stay");
					userChoice = keyboard.nextLine().toLowerCase(); 
												// String User Input
					boolean bust = true;
					while(userChoice.equals("hit") && bust) // Loop 10
					{
						bust = blackJackFun.hit();
						println("Do you want to hit or stay");
						userChoice = keyboard.nextLine().toLowerCase(); 
												// String User Input
					}
					blackJackFun.stay();
					break;
				case "poker":
					Poker pokerFun = new Poker();
					pokerFun.displayDescription();
					pokerFun.rules();
					pokerFun.play();
					break;
				default:
					return;

			}
		}

	}
}
