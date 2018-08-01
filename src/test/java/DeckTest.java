import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

	Deck deck;
	Card card;

	@Before
	public void before(){
		deck = new Deck();
		card = new Card(SuitType.SPADES, NumberType.SEVEN);
	}

	@Test
	public void checkFiftyTwoCardsInDeck(){
		assertEquals(52, deck.getCardCount());
	}

	@Test
	public void checkIfCardRemoved(){
		deck.removeTopCard();
		assertEquals(51, deck.getCardCount());
	}
}
