import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cardCollection;

	public Deck(){
		this.cardCollection = generateCards();
	}

	private ArrayList<Card> generateCards(){

		ArrayList<Card> cards = new ArrayList<>();
		for (SuitType suit: SuitType.values()) {
			for (NumberType number: NumberType.values()) {
				Card card = new Card(suit, number);
				cards.add(card);
			}
		}
		return cards;
	}

	public int getCardCount(){
		return cardCollection.size();
	}

	public Card removeTopCard(){
		return cardCollection.remove(0);
	}


}
