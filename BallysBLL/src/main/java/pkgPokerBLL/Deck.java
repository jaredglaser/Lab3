package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {

		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				}
			}
		}
		Collections.shuffle(DeckCards);
	}
	public Deck(int jokers)
	{
		
		
	}
	public Card DrawCard() {
		try{
			if(DeckCards.size() == 0){
				throw new DeckExecption("Deck of Cards is empty");
			}
			return DeckCards.remove(0);
		}
		catch(DeckExecption d)
		{
			print(d.getMessage());
		}
	}
}
