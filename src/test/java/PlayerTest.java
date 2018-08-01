import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {
	Player player1;
	Player player2;


	@Before
	public void before(){
		player1 = new Player("Kirstin");
		player2 = new Player("Joanna");
	}

	@Test
	public void canReceiveCard() {
		Card card = new Card(SuitType.SPADES, NumberType.ACE);
		player1.receiveCard(card);
		assertEquals(1, player1.cardCount());
	}


}
