import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

	Dealer dealer;
	@Before
	public void before(){
		dealer = new Dealer();

	}

	@Test
	public void canRemoveCardFromDeck(){
		dealer.dealCard();
		dealer.dealCard();
		assertEquals(50, dealer.getDeck().getCardCount());
	}
}
