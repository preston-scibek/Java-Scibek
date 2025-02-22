package chapter11gamezone2;

import java.util.Arrays;
import java.util.Collections;

public abstract class CardGame
{
	protected Card[] deck = new Card[52];
	protected int cardToPlayer;
	protected int depthInDeck = 0;

	/**
	 * builds a card game
	 */
	public CardGame()
	{
		int counter = 0;
		for(int i = 0; i < 13; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				this.deck[counter] = new Card();
				switch(j)
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
				switch(i)
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
	 * deals a card
	 */
	public abstract void deal();

	/**
	 * displays a description of the game
	 */
	public abstract void displayDescription();
}