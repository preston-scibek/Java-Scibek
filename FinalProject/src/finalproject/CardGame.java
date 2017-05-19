package finalproject;

import java.util.Arrays;
import java.util.Collections;

public abstract class CardGame extends MiniGame // Sub Class
{
	protected Card[] deck = new Card[52]; // Array
	protected int cardToPlayer;
	protected int depthInDeck = 0;

	/**
	 * builds a card game
	 */
	public CardGame()
	{
		int counter = 0;
		for(int i = 0; i < 13; i++) // Loop 12
		{
			for(int j = 0; j < 4; j++) // Loop 13
			{
				this.deck[counter] = new Card();
				switch(j) // Switch
				{
					case 0:
						this.deck[counter].setSuit("Clubs");
						break;
					case 1:
						this.deck[counter].setSuit("Spades");
						break;
					case 2:
						this.deck[counter].setSuit("Diamonds");
						break;
					case 3:
						this.deck[counter].setSuit("Hearts");
						break;
					default:
						this.deck[counter].setSuit("Clubs");
						break;
				}
				switch(i) // Switch
				{
					case 0:
						this.deck[counter].setValue("Jack");
						break;
					case 1:
						this.deck[counter].setValue("Ace");
						break;
					case 11:
						this.deck[counter].setValue("Queen");
						break;
					case 12:
						this.deck[counter].setValue("King");
						break;
					default:
						this.deck[counter].setValue(String.valueOf(i));
						break;
				}
				counter ++;
			}
		}
		this.shuffle();
	}

	/**
	 * shuffles the deck
	 */
	public void shuffle()
	{
		Collections.shuffle(Arrays.asList(this.deck));
	}

	/**
	 * displays a description of the game
	 */
	public abstract void displayDescription();

	/**
	 * deals a card
	 * @return - whether game is over or not
	 */
	public abstract boolean deal();

	/**
	 * deals the cards
	 * @param string - the player who the hand is for
	 * @return - the hand dealt to a player
	 */
	public abstract Card[] deal(String string);

}