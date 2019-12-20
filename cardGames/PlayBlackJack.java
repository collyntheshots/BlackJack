import deckOfCards.*;
import java.util.*;

public class PlayBlackJack
{
	public int pot;
	
	public static void printDeck(Deck deck)
	{
		for (Card cards : deck.getDeck())
			System.out.println("cardVal: " + cards.cardVal + ", suit: " + cards.suit);
	}
	public static void main(String [] args)
	{
		Deck deck = new Deck(8);
		printDeck(deck);
		System.out.println("==============");
		System.out.println("Size: " + deck.size());
		System.out.println("==============");


	}
}
