package chapter11gamezone2;

import static betterutils.BetterUtils.*;

public class Poker extends CardGame
{

	/**
	 * builds a poker game
	 */
	public Poker()
	{
		super();
		this.cardToPlayer = 5;
		this.shuffle();
	}

	/**
	 * deals the cards
	 */
	@Override
	public void deal()
	{
		int tempDepth = this.depthInDeck;
		for(int i = tempDepth; i < tempDepth + this.cardToPlayer; i++)
		{
			println("Player was dealt %s of %s.", deck[i].getValue(),
					this.deck[i].getSuit());
			this.depthInDeck += 1;
		}
	}

	/**
	 * displays the description
	 */
	@Override
	public void displayDescription()
	{
		println("POKER:\nA card game played by two or more people who bet on "
				+ "the value of the hands dealt to them.\n A player wins the "
				+ "pool either by having the highest combination at the showd"
				+ "own \nor by forcing all opponents to concede without a sho"
				+ "wing of the hand, sometimes by means of bluff.");
	}
}
