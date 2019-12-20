import deckOfCards.*;
import java.util.*;

public class Player
{
	private String playerName;
	public int chips;
	public List<Card> hand;

	public Player(String playerName, int startingChips)
	{
		this.playerName = playerName;
		this.chips = startingChips;
	}

	public void printPlayerInfo()
	{
		System.out.println("Player: " + this.playerName + "- " + this.chips);
	}
}
