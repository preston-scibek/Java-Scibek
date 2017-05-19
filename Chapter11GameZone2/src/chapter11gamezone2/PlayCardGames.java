package chapter11gamezone2;

public class PlayCardGames
{
	public static void main(String[] args)
	{
		Poker poker = new Poker();
		poker.displayDescription();
		poker.deal();
		BlackJack blackjack = new BlackJack();
		blackjack.displayDescription();
		blackjack.deal();
	}
}
