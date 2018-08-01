import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealerTest {

	Dealer dealer;
	Player player1;
	Player player2;
	Card card1;
	Card card2;
	Card card3;

	@Before
	public void before(){
		dealer = new Dealer();
		player1 = new Player("Mike");
		player2 = new Player("Joanna");
		card1 = new Card(SuitType.CLUBS, NumberType.NINE);
		card2 = new Card(SuitType.CLUBS, NumberType.SEVEN);
		card3 = new Card(SuitType.SPADES, NumberType.NINE);
	}

	@Test
	public void canRemoveCardFromDeck(){
		dealer.dealCard(player1);
		dealer.dealCard(player1);
		assertEquals(50, dealer.getDeck().getCardCount());
	}

	@Test
	public void canDealCardToPlayer(){
		dealer.dealCard(player1);
		assertEquals(1,player1.cardCount());
	}

	@Test
	public void canAddPlayers(){
		dealer.addPlayerToGame(player1);
		assertEquals(1, dealer.countPlayers());
	}

	@Test
	public void canDetermineWinnerFirstWinsWithNumber(){
		dealer.addPlayerToGame(player1);
		dealer.addPlayerToGame(player2);
		dealer.dealCard(player1);
		dealer.dealCard(player2);
		assertEquals(player2, dealer.determineWinner());
	}

	@Test
	public void canDetermineWinnerSecondWinsWithSuit(){
		player1.receiveCard(card1);
		player2.receiveCard(card3);
		dealer.addPlayerToGame(player1);
		dealer.addPlayerToGame(player2);

		assertEquals(player2, dealer.determineWinner());
	}


}
