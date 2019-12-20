package deckOfCards;

import java.util.*;

public class Deck
{
	private static final int DECK_DEFAULT_TOTAL = 1;
	private static final int DECK_DEFAULT_SIZE = 52;
	private static final int CARD_DEFAULT_TOTAL = 13;
	private static final int SUIT_DEFAULT_TOTAL = 4;
	private List<Card> deck;

	public Deck()
	{
		this(DECK_DEFAULT_TOTAL);
	}

	public Deck(int totalDecks)
	{
		deck = new ArrayList<>(totalDecks * DECK_DEFAULT_SIZE);
		addDeck(totalDecks);
	}

	public void addDeck()
	{
		addDeck(DECK_DEFAULT_TOTAL);
	}

	public void addDeck(int totalDecks)
	{
		List<Card> newDeck = new ArrayList<>(DECK_DEFAULT_SIZE);
		for (int i = 0; i < (CARD_DEFAULT_TOTAL * totalDecks); i++)
			for (int j = 0; j < SUIT_DEFAULT_TOTAL; j++)
				newDeck.add(new Card(Integer.toString((i % 13) + 1), j));
		Collections.shuffle(newDeck);

		deck.addAll(newDeck);
	}

	public Card dealCard()
	{
		return deck.remove(0);
	}

	public void shuffle()
	{
		Collections.shuffle(deck);
	}

	public int size()
	{
		return deck.size();
	}

	public List<Card> getDeck()
	{
		return deck;
	}


/*
	public static void main(String [] args)
	{
		System.out.println("=============");
		System.out.println("Creating Deck");
		System.out.println("=============");
		Deck newDeck = new Deck();

		System.out.println("=============");
		System.out.println("Starting Size");
		System.out.println("=============");
		System.out.println("Size: " + newDeck.size());

		System.out.println("=============");
		System.out.println("Printing Deck");
		System.out.println("=============");

		for (Card cards : newDeck.getDeck())
			System.out.println("cardVal: " + cards.cardVal + ", suit: " + cards.suit);

		System.out.println("==============");
		System.out.println("Shuffling Deck");
		System.out.println("==============");

		newDeck.shuffle();
		for (Card cards : newDeck.getDeck())
			System.out.println("cardVal: " + cards.cardVal + ", suit: " + cards.suit);

		System.out.println("==============");
		System.out.println("Adding to Deck");
		System.out.println("==============");

		newDeck.addDeck();

		for (Card cards : newDeck.getDeck())
			System.out.println("cardVal: " + cards.cardVal + ", suit: " + cards.suit);

		System.out.println("=================");
		System.out.println("After Adding Size");
		System.out.println("=================");

		System.out.println("Size: " + newDeck.size());

		System.out.println("================");
		System.out.println("Dealing Top Card");
		System.out.println("================");

		Card card = newDeck.dealCard();
		System.out.println("\n================\n");
		System.out.println("Dealt card: " + card.cardVal + " of " + card.suit);
		System.out.println("\n================\n");

		for (Card cards : newDeck.getDeck())
			System.out.println("cardVal: " + cards.cardVal + ", suit: " + cards.suit);

		System.out.println("==================");
		System.out.println("After Dealing Size");
		System.out.println("==================");

		System.out.println("Size: " + newDeck.size());

	}

*/
}
