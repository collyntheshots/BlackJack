package deckOfCards;

import java.util.*;

public class Card
{
	private static final String [] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
	public String suit;
	public String cardVal;

	public Card(String cardVal, int suit)
	{
		this.cardVal = cardVal;
		this.suit = suits[suit];
	}
}
