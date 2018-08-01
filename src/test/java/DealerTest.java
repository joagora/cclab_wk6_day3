import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

	Dealer dealer;
	Player player;

	@Before
	public void before(){
		dealer = new Dealer();
		player = new Player("Mike");

	}

	@Test
	public void canRemoveCardFromDeck(){
		dealer.dealCard(player);
		dealer.dealCard(player);
		assertEquals(50, dealer.getDeck().getCardCount());
	}

	@Test
	public void canDealCardToPlayer(){
		dealer.dealCard(player);
		assertEquals(1,player.cardCount());
	}

	@Test
	public void canAddPlayers(){
		dealer.addPlayerToGame(player);
		assertEquals(1, dealer.countPlayers());
	}




}
